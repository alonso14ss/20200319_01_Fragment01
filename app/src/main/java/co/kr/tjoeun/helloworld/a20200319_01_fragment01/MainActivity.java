package co.kr.tjoeun.helloworld.a20200319_01_fragment01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import co.kr.tjoeun.helloworld.a20200319_01_fragment01.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setupEvents();
        setValues();
        
    }

    @Override
    public void setupEvents() {

        binding.firstFragCallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//              첫 프래그먼트 호출버튼이 눌리면?
//                first프래그 보이개 => first프래그 자체는 기능이 별로없음
//                감싸는 레이아웃 추가 => 얘를 보이게
                binding.firstFragLayout.setVisibility(View.VISIBLE);
//                second프래그 숨김
                binding.secondFragLayout.setVisibility(View.GONE);

            }
        });

        binding.secondFrageCallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.firstFragLayout.setVisibility(View.GONE);

                binding.secondFragLayout.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    public void setValues() {

    }
}
