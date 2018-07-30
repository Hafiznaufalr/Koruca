package droidmentor.bnv_with_viewpager.Fragment;


import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Locale;

import droidmentor.bnv_with_viewpager.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactsFragment extends Fragment {

    private ImageButton buttonSpeak;
   private EditText editText;
    private TextToSpeech textToSpeech;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contacts, container, false);
        buttonSpeak = (ImageButton)view.findViewById(R.id.btnSpeak);
        editText = (EditText)view.findViewById(R.id.editText);
        textToSpeech = new TextToSpeech(getActivity(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

                //method untuk mendeteksi suara dari text

                if(status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(new Locale("id","ID"));
                    //menggunakan bahasa ID (id)

                }
            }
        });

        buttonSpeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //mengambil nilai value dari inputan edittext
                String text = editText.getText().toString();
                //untuk penanganan masalah deprecated pada saat memanggil suara
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    textToSpeech.speak(text,TextToSpeech.QUEUE_FLUSH,null,null);



                } else {
                    textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
                }
            }
        });
        return view;


    }

}
