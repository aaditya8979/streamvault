package com.mgs.carparking.widgets;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.util.DotView;
import java.io.Serializable;
import java.util.ArrayList;
import zp.o;

/* JADX INFO: loaded from: classes11.dex */
public class BannerView extends RelativeLayout implements ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager f45013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DotView f45014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<Banner> f45015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f45016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f45018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View[] f45019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f45020i;

    public static class Banner implements Serializable {
        public AdInfoDetailEntry entry;
        public boolean isAutoScroll;
        public boolean isPinch;
        public String linkUrl;
        public fd.b mMtgNativeAD;
        public int resId;
        public String title;
        public String url;

        public Banner(int i10) {
            this.resId = i10;
            this.isPinch = false;
            this.isAutoScroll = true;
        }

        public Banner(AdInfoDetailEntry adInfoDetailEntry, fd.b bVar, String str, String str2, String str3, boolean z10, boolean z11) {
            this.mMtgNativeAD = bVar;
            this.entry = adInfoDetailEntry;
            this.url = str;
            this.linkUrl = str2;
            this.title = str3;
            this.isPinch = z10;
            this.isAutoScroll = z11;
        }

        public Banner(String str, String str2) {
            this.url = str;
            this.linkUrl = str2;
            this.isPinch = false;
            this.isAutoScroll = true;
        }
    }

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            BannerView.this.f45013b.setCurrentItem((BannerView.this.f45017f + 1) % BannerView.this.f45015d.size(), true);
        }
    }

    public class b extends PagerAdapter {

        public class a implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f45023b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Banner f45024c;

            public a(int i10, Banner banner) {
                this.f45023b = i10;
                this.f45024c = banner;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                BannerView.this.f45018g.a(this.f45023b, this.f45024c);
            }
        }

        public b() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return BannerView.this.f45015d.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i10) {
            fd.b bVar;
            int size = i10 % BannerView.this.f45015d.size();
            View viewInflate = LayoutInflater.from(BannerView.this.getContext()).inflate(R.layout.viewpaper_item, (ViewGroup) null);
            Banner banner = (Banner) BannerView.this.f45015d.get(size);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.ivImage);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tvTitle);
            FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.layout_adView);
            if (o.b(banner.url)) {
                frameLayout.setVisibility(0);
                textView.setVisibility(8);
                AdInfoDetailEntry adInfoDetailEntry = banner.entry;
                if (adInfoDetailEntry != null && (bVar = banner.mMtgNativeAD) != null) {
                    BannerView.this.e(bVar, adInfoDetailEntry, frameLayout);
                }
            } else {
                frameLayout.setVisibility(8);
                textView.setVisibility(0);
                if (o.b(banner.url)) {
                    imageView.setImageResource(R.drawable.ic_video_default_horizontal);
                } else {
                    ud.c.c(BannerView.this.getContext(), banner.url, R.drawable.ic_video_default_horizontal, R.drawable.ic_video_default_horizontal, imageView, false);
                }
                if (o.b(banner.title)) {
                    textView.setVisibility(8);
                    textView.setText("");
                } else {
                    textView.setText(banner.title);
                    textView.setVisibility(0);
                }
                imageView.setOnClickListener(new a(size, banner));
            }
            viewGroup.addView(viewInflate);
            return viewInflate;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public interface c {
        void a(int i10, Banner banner);
    }

    public BannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45020i = new a();
        g();
    }

    public BannerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f45020i = new a();
        g();
    }

    public void e(fd.b bVar, AdInfoDetailEntry adInfoDetailEntry, FrameLayout frameLayout) {
        bVar.a(frameLayout, adInfoDetailEntry, 2);
    }

    public void f(ArrayList<Banner> arrayList, c cVar) {
        this.f45015d = arrayList;
        this.f45018g = cVar;
        this.f45019h = new View[arrayList.size()];
        if (this.f45016e == null) {
            this.f45016e = new b();
        }
        this.f45013b.setAdapter(this.f45016e);
        this.f45013b.setOffscreenPageLimit(arrayList.size());
        this.f45014c.b(0, arrayList.size());
        if (arrayList.size() <= 1 || !arrayList.get(0).isAutoScroll) {
            return;
        }
        this.f45020i.sendEmptyMessageDelayed(0, 8000L);
    }

    public final void g() {
        LayoutInflater.from(getContext()).inflate(R.layout.widget_banner_view, this);
        ViewPager viewPager = (ViewPager) findViewById(R.id.mBannerPager);
        this.f45013b = viewPager;
        viewPager.addOnPageChangeListener(this);
        this.f45014c = (DotView) findViewById(R.id.mBannerDotView);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i10, float f10, int i11) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i10) {
        this.f45020i.removeMessages(0);
        this.f45017f = i10;
        if (this.f45015d.size() > 1) {
            this.f45014c.b(i10 % this.f45015d.size(), this.f45015d.size());
            if (this.f45015d.get(0).isAutoScroll) {
                this.f45020i.sendEmptyMessageDelayed(0, 8000L);
            }
        }
    }
}
