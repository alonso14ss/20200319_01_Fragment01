package co.kr.tjoeun.helloworld.a20200319_01_fragment01.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import co.kr.tjoeun.helloworld.a20200319_01_fragment01.R;
import co.kr.tjoeun.helloworld.a20200319_01_fragment01.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    FragmentSecondBinding binding = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container,false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = binding.idEdt.getText().toString();
                String pw = binding.pwEdt.getText().toString();

                if(id.equals("admin") && pw.equals("asdf1234")){
                    Toast.makeText(getActivity(), "관리자 로그인!", Toast.LENGTH_SHORT).show();
                }
                else if(id.equals("admin") && pw != "asdf1234"){
                    Toast.makeText(getActivity(), "비번이 틀렸음", Toast.LENGTH_SHORT).show();
                }else if(id !="admin" && pw.equals("asdf1234")){
                    Toast.makeText(getActivity(), "아이디 틀림", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getActivity(), "제대로 입력해", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
