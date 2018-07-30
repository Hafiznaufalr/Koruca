package droidmentor.bnv_with_viewpager.list2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mindorks.placeholderview.PlaceHolderView;

import droidmentor.bnv_with_viewpager.R;
import droidmentor.bnv_with_viewpager.list2.GalleryItem2;

public class ListActivity2 extends AppCompatActivity {


    private PlaceHolderView mGalleryView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);

        mGalleryView2 = (PlaceHolderView)findViewById(R.id.galleryView2);
        mGalleryView2
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.ha)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hb)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hc)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hd)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.he)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hf)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hg)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hh)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hi)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hj)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hk)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hl)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hm)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hn)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hoh)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hp)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hq)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hr)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hs)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.ht)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hu)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hv)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hw)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hx)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hy)))
                .addView(new GalleryItem2(getResources().getDrawable(R.drawable.hz)))
                ;
    }

}