package com.mgs.carparking.widgets.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dramarush.shortin.R;
import ed.e;
import ic.s;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class TabLayout extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<b> f45654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f45655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f45656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45657e;

    public interface a {
        void onTabClick(b bVar);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f45658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f45659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f45661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Class<? extends vd.a> f45663f;

        public b(int i10, String str, int i11, int i12, Class<? extends vd.a> cls, int i13) {
            this.f45658a = i10;
            this.f45659b = str;
            this.f45662e = i11;
            this.f45660c = i12;
            this.f45663f = cls;
            this.f45661d = i13;
        }
    }

    public class c extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f45664b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f45665c;

        public c(Context context) {
            super(context);
            a();
        }

        public final void a() {
            LayoutInflater.from(getContext()).inflate(R.layout.widget_tab_view, (ViewGroup) this, true);
            setOrientation(1);
            setGravity(81);
            this.f45664b = (ImageView) findViewById(R.id.mTabImg);
            this.f45665c = (TextView) findViewById(R.id.mTabLabel);
        }

        public void setUpData(b bVar) {
            this.f45664b.setBackgroundResource(bVar.f45658a);
            this.f45665c.setText(bVar.f45659b);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c();
    }

    public c a(int i10) {
        if (i10 >= this.f45657e || i10 < 0) {
            return null;
        }
        return (c) getChildAt(i10);
    }

    public void b(ArrayList<b> arrayList, a aVar) {
        this.f45654b = arrayList;
        this.f45655c = aVar;
        if (arrayList == null || arrayList.size() <= 0) {
            throw new IllegalArgumentException("tabs can't be empty");
        }
        this.f45657e = arrayList.size();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.gravity = 81;
        layoutParams.weight = 1.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c cVar = new c(getContext());
            cVar.setTag(arrayList.get(i10));
            cVar.setUpData(arrayList.get(i10));
            cVar.setOnClickListener(this);
            addView(cVar, layoutParams);
        }
    }

    public final void c() {
        setOrientation(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view != null) {
            if (this.f45656d == view) {
                if (e.q() && ((b) view.getTag()).f45661d == 0) {
                    op.a.a().b(new s());
                    return;
                }
                return;
            }
            this.f45655c.onTabClick((b) view.getTag());
            view.setSelected(true);
            View view2 = this.f45656d;
            if (view2 != null) {
                view2.setSelected(false);
            }
            this.f45656d = view;
        }
    }

    public void setCurrentTab(int i10) {
        if (i10 >= this.f45657e || i10 < 0) {
            return;
        }
        onClick(getChildAt(i10));
    }
}
