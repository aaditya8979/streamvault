package com.mgs.carparking.util;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.dramarush.shortin.R;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ScrollTextView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f44992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f44993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f44994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f45000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<String> f45001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f45002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45003m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f45004n;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollTextView.this.f44995e = !r0.f44995e;
            if (ScrollTextView.this.f45002l == ScrollTextView.this.f45001k.size() - 1) {
                ScrollTextView.this.f45002l = 0;
            }
            if (ScrollTextView.this.f44995e) {
                ScrollTextView.this.f44992b.setText((CharSequence) ScrollTextView.this.f45001k.get(ScrollTextView.f(ScrollTextView.this)));
                ScrollTextView.this.f44993c.setText((CharSequence) ScrollTextView.this.f45001k.get(ScrollTextView.this.f45002l));
            } else {
                ScrollTextView.this.f44993c.setText((CharSequence) ScrollTextView.this.f45001k.get(ScrollTextView.f(ScrollTextView.this)));
                ScrollTextView.this.f44992b.setText((CharSequence) ScrollTextView.this.f45001k.get(ScrollTextView.this.f45002l));
            }
            ScrollTextView scrollTextView = ScrollTextView.this;
            scrollTextView.f44996f = scrollTextView.f44995e ? 0 : ScrollTextView.this.f45003m;
            ScrollTextView scrollTextView2 = ScrollTextView.this;
            scrollTextView2.f44997g = scrollTextView2.f44995e ? -ScrollTextView.this.f45003m : 0;
            ObjectAnimator.ofFloat(ScrollTextView.this.f44992b, "translationY", ScrollTextView.this.f44996f, ScrollTextView.this.f44997g).setDuration(300L).start();
            ScrollTextView scrollTextView3 = ScrollTextView.this;
            scrollTextView3.f44998h = scrollTextView3.f44995e ? ScrollTextView.this.f45003m : 0;
            ScrollTextView scrollTextView4 = ScrollTextView.this;
            scrollTextView4.f44999i = scrollTextView4.f44995e ? 0 : -ScrollTextView.this.f45003m;
            ObjectAnimator.ofFloat(ScrollTextView.this.f44993c, "translationY", ScrollTextView.this.f44998h, ScrollTextView.this.f44999i).setDuration(300L).start();
            ScrollTextView.this.f44994d.postDelayed(ScrollTextView.this.f45000j, 3000L);
        }
    }

    public ScrollTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f44995e = false;
        this.f45002l = 0;
        this.f45003m = 100;
        this.f45004n = false;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.widget_scroll_text_layout, this);
        this.f44992b = (TextView) viewInflate.findViewById(R.id.tv_banner1);
        this.f44993c = (TextView) viewInflate.findViewById(R.id.tv_banner2);
        this.f44994d = new Handler();
        this.f45000j = new a();
    }

    public static /* synthetic */ int f(ScrollTextView scrollTextView) {
        int i10 = scrollTextView.f45002l;
        scrollTextView.f45002l = i10 + 1;
        return i10;
    }

    public List<String> getList() {
        return this.f45001k;
    }

    public void setList(List<String> list) {
        this.f45001k = list;
        if (list.size() > 1) {
            list.add(list.get(0));
        }
    }

    public void t() {
        this.f44992b.setText(this.f45001k.get(0));
        if (this.f45001k.size() <= 1) {
            this.f45004n = false;
        } else {
            if (this.f45004n) {
                return;
            }
            this.f45004n = true;
            this.f44994d.postDelayed(this.f45000j, 3000L);
        }
    }

    public void u() {
        this.f44994d.removeCallbacks(this.f45000j);
        this.f45004n = false;
    }
}
