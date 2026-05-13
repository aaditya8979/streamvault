package sg.bigo.ads.ad.interstitial.e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.e.a.b;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* JADX INFO: loaded from: classes12.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.ad.interstitial.e.b.a f80880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final List<NativeAd> f80881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.ad.interstitial.e.a.b f80882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Context f80883d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b.a f80886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f80887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f80888i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f80885f = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final b f80884e = a();

    public d(@NonNull sg.bigo.ads.ad.interstitial.e.b.a aVar, @NonNull List<NativeAd> list, @NonNull sg.bigo.ads.ad.interstitial.e.a.b bVar) {
        this.f80880a = aVar;
        this.f80881b = list;
        this.f80882c = bVar;
        this.f80883d = aVar.getContext();
        this.f80886g = bVar.c();
        this.f80887h = sg.bigo.ads.common.utils.e.a(r2, 1);
        this.f80888i = sg.bigo.ads.common.utils.e.a(r2, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(@NonNull View view, @Nullable b bVar) {
        if (bVar == null) {
            bVar = this.f80884e;
        }
        if (bVar == null || view == 0) {
            return;
        }
        Drawable drawableA = bVar.a();
        if (drawableA != null) {
            view.setBackground(drawableA);
            view.setPadding(0, 0, 0, 0);
        } else if (view instanceof sg.bigo.ads.common.view.a.c) {
            ((sg.bigo.ads.common.view.a.c) view).setBlurStyle(bVar);
        }
    }

    @Nullable
    public abstract List<View> a(@NonNull a aVar);

    public abstract b a();

    public final void a(int i10, int i11, int i12, int i13) {
        this.f80880a.setPadding(sg.bigo.ads.common.utils.e.a(this.f80883d, i10), sg.bigo.ads.common.utils.e.a(this.f80883d, i11), sg.bigo.ads.common.utils.e.a(this.f80883d, i12), sg.bigo.ads.common.utils.e.a(this.f80883d, i13));
    }

    public final void a(@NonNull View view) {
        a(view, (b) null);
    }

    public void a(TextView textView) {
    }

    public final void a(@NonNull a aVar, boolean z10) {
        this.f80880a.removeAllViews();
        List<View> listA = a(aVar);
        if (sg.bigo.ads.common.utils.k.a((Collection) listA)) {
            return;
        }
        for (int i10 = 0; i10 < listA.size() && i10 < this.f80881b.size(); i10++) {
            View view = listA.get(i10);
            NativeAd nativeAd = this.f80881b.get(i10);
            if (view != null && nativeAd != null) {
                ArrayList arrayList = new ArrayList();
                RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) view.findViewById(R.id.inter_icon_ads_icon_item_layout);
                if (roundedFrameLayout != null) {
                    roundedFrameLayout.setStrokeWidth(this.f80887h);
                    roundedFrameLayout.setStrokeColor(this.f80886g.f80817j);
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.inter_icon_ads_item_icon);
                if (imageView != null) {
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    imageView.setTag(1);
                    arrayList.add(imageView);
                    imageView.setBackgroundColor(this.f80886g.f80816i);
                    imageView.setImageDrawable(sg.bigo.ads.common.utils.a.a(imageView.getContext(), R.drawable.bigo_ad_icon_default));
                }
                TextView textView = (TextView) view.findViewById(R.id.inter_icon_ads_item_title);
                if (textView != null) {
                    if (z10) {
                        textView.setTextColor(this.f80886g.f80811d);
                    }
                    textView.setText(nativeAd.getTitle());
                    textView.setTag(2);
                    arrayList.add(textView);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.inter_icon_ads_item_sponsored);
                if (textView2 != null) {
                    if (z10) {
                        textView2.setTextColor(this.f80886g.f80811d);
                    }
                    textView2.setText(nativeAd.getSponsored());
                    textView2.setTag(3);
                    a(textView2);
                    arrayList.add(textView2);
                }
                TextView textView3 = (TextView) view.findViewById(R.id.inter_icon_ads_item_desc);
                if (textView3 != null) {
                    if (z10) {
                        textView3.setTextColor(this.f80886g.f80811d);
                    }
                    textView3.setText(nativeAd.getDescription());
                    textView3.setTag(6);
                    arrayList.add(textView3);
                }
                Button button = (Button) view.findViewById(R.id.inter_icon_ads_item_btn_cta);
                if (button != null) {
                    button.setText(nativeAd.getCallToAction());
                    button.setTag(7);
                    arrayList.add(button);
                    float f10 = this.f80888i;
                    b.a aVar2 = this.f80886g;
                    button.setBackground(sg.bigo.ads.common.utils.d.a(f10, f10, f10, f10, aVar2.f80818k, aVar2.f80819l, this.f80887h));
                }
                ViewGroup viewGroup = listA.size() == 1 ? this.f80880a : (ViewGroup) view;
                if (nativeAd instanceof sg.bigo.ads.ad.b.b) {
                    sg.bigo.ads.ad.b.b bVar = (sg.bigo.ads.ad.b.b) nativeAd;
                    bVar.H = this.f80882c.l();
                    if (this.f80885f) {
                        sg.bigo.ads.ad.b.a.a(viewGroup, viewGroup, 1, bVar, this.f80882c.l());
                    }
                }
                nativeAd.registerViewForInteraction(viewGroup, (MediaView) null, imageView, (AdOptionsView) null, arrayList);
            }
        }
    }

    public final void a(@Nullable b bVar) {
        a(this.f80880a, bVar);
    }

    public final int b() {
        return this.f80881b.size();
    }

    public final void b(@NonNull View view) {
        view.setPadding(sg.bigo.ads.common.utils.e.a(this.f80883d, 12), sg.bigo.ads.common.utils.e.a(this.f80883d, 0), sg.bigo.ads.common.utils.e.a(this.f80883d, 12), sg.bigo.ads.common.utils.e.a(this.f80883d, 12));
    }

    public final void c() {
        a(this.f80880a, (b) null);
    }
}
