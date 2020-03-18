package com.gigamole.infinitecycleviewpager;

import androidx.viewpager.widget.PagerAdapter;
import android.view.View;

import static androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import static androidx.viewpager.widget.ViewPager.PageTransformer;

/**
 * Created by GIGAMOLE on 7/27/16.
 */

// Interface that duplicate methods of ViewPager for implements it in Horizontal and Vertical
// InfiniteCycleViewPager for casting them to ViewPageable in InfiniteCycleManager
public interface ViewPageable {

    boolean hasWindowFocus();
    int getCurrentItem();
    int getChildCount();
    View getChildAt(final int index);
    PagerAdapter getAdapter();

    boolean post(final Runnable runnable);

    void addOnPageChangeListener(final OnPageChangeListener onPageChangeListener);
    void setClipChildren(final boolean clipChildren);
    void setDrawingCacheEnabled(final boolean drawingCacheEnabled);
    void setWillNotCacheDrawing(final boolean willNotCacheDrawing);
    void setOverScrollMode(final int overScrollMode);
    void setCurrentItem(final int item);
    void setPageTransformer(final boolean reverseDrawingOrder, final PageTransformer transformer);
    void setPageMargin(final int pageMargin);
    void setOffscreenPageLimit(final int offscreenPageLimit);

    boolean isFakeDragging();
    boolean beginFakeDrag();
    void fakeDragBy(final float dragBy);
    void endFakeDrag();

}