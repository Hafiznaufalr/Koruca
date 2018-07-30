package droidmentor.bnv_with_viewpager.list2;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.mindorks.placeholderview.Animation;
import com.mindorks.placeholderview.annotations.Animate;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.NonReusable;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;

import droidmentor.bnv_with_viewpager.R;

@Animate(Animation.CARD_LEFT_IN_DESC)
@NonReusable
@Layout(R.layout.gallery_item2)
public class GalleryItem2 {

    @View(R.id.imageView2)
    private ImageView imageView2;

    private Drawable mDrawable2;


    public GalleryItem2(Drawable drawable) {
        mDrawable2 = drawable;
    }

    @Resolve
    private void onResolved() {
        imageView2.setImageDrawable(mDrawable2);
    }
}