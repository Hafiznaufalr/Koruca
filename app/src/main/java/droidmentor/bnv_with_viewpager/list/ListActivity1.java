package droidmentor.bnv_with_viewpager.list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mindorks.placeholderview.PlaceHolderView;

import droidmentor.bnv_with_viewpager.R;
import droidmentor.bnv_with_viewpager.list2.GalleryItem2;


public class ListActivity1 extends AppCompatActivity {


    private PlaceHolderView mGalleryView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list1);

        mGalleryView = (PlaceHolderView)findViewById(R.id.galleryView);
        mGalleryView
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.a0)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.a1)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.a2)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.a3)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.a4)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.a5)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.a6)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.a7)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.a8)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.a9)))

        ;
    }

}