package wuhao.bwei.com.wuhaoonepiece.view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mob.MobSDK;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;
import wuhao.bwei.com.wuhaoonepiece.R;

public class YanZhengActivity extends AppCompatActivity {

    @BindView(R.id.fanid)
    ImageView fanid;
    @BindView(R.id.yiyou)
    TextView yiyou;
    @BindView(R.id.numberid)
    EditText numberid;
    @BindView(R.id.getyanzheng)
    TextView getyanzheng;
    @BindView(R.id.yanzhengid)
    EditText yanzhengid;
    @BindView(R.id.nextid)
    Button nextid;
    @BindView(R.id.youkeid)
    TextView youkeid;
    private Boolean isPhoneNumberOk;
    private Boolean isCodeOk;
    private Boolean isPasswordOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yan_zheng);
        ButterKnife.bind(this);
        MobSDK.init(YanZhengActivity.this, "23a7286818901", "04bf56f24f66acca1cc6d31393cb606a");
        initData();
        initEvent();



    }
    //初始数据
    private void initData() {
        //初始注册按钮无法点击
        isPhoneNumberOk = false;
        isCodeOk = false;
        nextid.setEnabled(false);
    }

    private void initEvent() {
        //绑定监听器
        numberid.addTextChangedListener(phoneNumberWatcher);
        yanzhengid.addTextChangedListener(codeWatecher);
    }




    @OnClick({R.id.fanid, R.id.yiyou,R.id.getyanzheng, R.id.nextid, R.id.youkeid})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.fanid:
                finish();
                overridePendingTransition(R.anim.out_to_left1, R.anim.in_from_right1);
                break;
            case R.id.yiyou:
                finish();
                break;
            case R.id.getyanzheng:
                sendCode();
                //SMSSDK.getSupportedCountries();
                SMSSDK.getVerificationCode("86", numberid.getText().toString());

                break;
            case R.id.nextid:
                SMSSDK.submitVerificationCode("86", numberid.getText().toString(), yanzhengid.getText().toString());

                break;
            case R.id.youkeid:
                final Intent intent = new Intent(YanZhengActivity.this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }
    //设置注册按钮是否可以点击
    private void setButtonEnable() {
        if (isCodeOk & isPhoneNumberOk) {
            nextid.setEnabled(true);
            nextid.setBackgroundColor(Color.parseColor("#00BB00"));
            nextid.setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            nextid.setEnabled(false);
            nextid.setBackgroundColor(Color.parseColor("#E0E0E0"));
        }

    }

    private void sendCode() {

        EventHandler eventHandler = new EventHandler() {
            //初始化接口
            @Override
            public void afterEvent(int i, int i1, Object o) {
                super.afterEvent(i, i1, o);
                //成功接收到验证码时提醒用户
                if (i1 == SMSSDK.RESULT_COMPLETE) {
                    if (i == SMSSDK.EVENT_GET_VERIFICATION_CODE) {//发送验证码函数被调用
                        // Log.d("RegisterActivity","11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
                        //Log.d("RegisterActivity",""+i);
                        // Toast.makeText(RegisterActivity.this,"验证码已送达",Toast.LENGTH_SHORT).show();
                    } else if (i == SMSSDK.EVENT_GET_SUPPORTED_COUNTRIES) {
                        //支持发送验证码的国家列表方法被调用
                        //Toast.makeText(RegisterActivity.this, "验证码已送达", Toast.LENGTH_SHORT).show();
                        Log.d("RegisterActivity", "这个函数有执行：" + o);
                    } else if (i == SMSSDK.EVENT_SUBMIT_VERIFICATION_CODE) {//提交验证码被调用
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(YanZhengActivity.this, "验证成功", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(YanZhengActivity.this, UpdataPassActivity.class);
                                startActivity(intent);
                                finish();

                            }
                        });
                    }

                }

            }
        };
        //注册监听器
        SMSSDK.registerEventHandler(eventHandler);


    }
    TextWatcher phoneNumberWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String inputStr = editable.toString().trim();
            if (!TextUtils.isEmpty(inputStr) && inputStr.getBytes().length == 11) {
                isPhoneNumberOk = true;
            } else {
                isPhoneNumberOk = false;

            }
            setButtonEnable();
        }
    };

    //监听验证码格式是否正确
    TextWatcher codeWatecher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {
            String code = editable.toString().trim();
            if (!TextUtils.isEmpty(code)) {
                isCodeOk = true;
            } else {
                isCodeOk = false;
            }
            setButtonEnable();
        }
    };


}
