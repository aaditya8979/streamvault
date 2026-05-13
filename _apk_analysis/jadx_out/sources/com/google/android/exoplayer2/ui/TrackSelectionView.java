package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.d0;
import com.google.common.collect.ImmutableList;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflater f22701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckedTextView f22702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CheckedTextView f22703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f22704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<d0.a> f22705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<e7.g0, q7.w> f22706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m0 f22709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CheckedTextView[][] f22710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Comparator<c> f22712n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public d f22713o;

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.c(view);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d0.a f22715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22716b;

        public c(d0.a aVar, int i10) {
            this.f22715a = aVar;
            this.f22716b = i10;
        }

        public com.google.android.exoplayer2.m a() {
            return this.f22715a.c(this.f22716b);
        }
    }

    public interface d {
        void onTrackSelectionChanged(boolean z10, Map<e7.g0, q7.w> map);
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f22700b = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f22701c = layoutInflaterFrom;
        b bVar = new b();
        this.f22704f = bVar;
        this.f22709k = new e(getResources());
        this.f22705g = new ArrayList();
        this.f22706h = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f22702d = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R$string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(R$layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f22703e = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R$string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    public static Map<e7.g0, q7.w> b(Map<e7.g0, q7.w> map, List<d0.a> list, boolean z10) {
        HashMap map2 = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            q7.w wVar = map.get(list.get(i10).b());
            if (wVar != null && (z10 || map2.isEmpty())) {
                map2.put(wVar.f78126b, wVar);
            }
        }
        return map2;
    }

    public final void c(View view) {
        if (view == this.f22702d) {
            e();
        } else if (view == this.f22703e) {
            d();
        } else {
            f(view);
        }
        i();
        d dVar = this.f22713o;
        if (dVar != null) {
            dVar.onTrackSelectionChanged(getIsDisabled(), getOverrides());
        }
    }

    public final void d() {
        this.f22711m = false;
        this.f22706h.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        this.f22711m = true;
        this.f22706h.clear();
    }

    public final void f(View view) {
        this.f22711m = false;
        c cVar = (c) s7.a.e(view.getTag());
        e7.g0 g0VarB = cVar.f22715a.b();
        int i10 = cVar.f22716b;
        q7.w wVar = this.f22706h.get(g0VarB);
        if (wVar == null) {
            if (!this.f22708j && this.f22706h.size() > 0) {
                this.f22706h.clear();
            }
            this.f22706h.put(g0VarB, new q7.w(g0VarB, ImmutableList.of(Integer.valueOf(i10))));
            return;
        }
        ArrayList arrayList = new ArrayList(wVar.f78127c);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zG = g(cVar.f22715a);
        boolean z10 = zG || h();
        if (zIsChecked && z10) {
            arrayList.remove(Integer.valueOf(i10));
            if (arrayList.isEmpty()) {
                this.f22706h.remove(g0VarB);
                return;
            } else {
                this.f22706h.put(g0VarB, new q7.w(g0VarB, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zG) {
            this.f22706h.put(g0VarB, new q7.w(g0VarB, ImmutableList.of(Integer.valueOf(i10))));
        } else {
            arrayList.add(Integer.valueOf(i10));
            this.f22706h.put(g0VarB, new q7.w(g0VarB, arrayList));
        }
    }

    public final boolean g(d0.a aVar) {
        return this.f22707i && aVar.d();
    }

    public boolean getIsDisabled() {
        return this.f22711m;
    }

    public Map<e7.g0, q7.w> getOverrides() {
        return this.f22706h;
    }

    public final boolean h() {
        return this.f22708j && this.f22705g.size() > 1;
    }

    public final void i() {
        this.f22702d.setChecked(this.f22711m);
        this.f22703e.setChecked(!this.f22711m && this.f22706h.size() == 0);
        for (int i10 = 0; i10 < this.f22710l.length; i10++) {
            q7.w wVar = this.f22706h.get(this.f22705g.get(i10).b());
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f22710l[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (wVar != null) {
                        this.f22710l[i10][i11].setChecked(wVar.f78127c.contains(Integer.valueOf(((c) s7.a.e(checkedTextViewArr[i11].getTag())).f22716b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    public final void j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f22705g.isEmpty()) {
            this.f22702d.setEnabled(false);
            this.f22703e.setEnabled(false);
            return;
        }
        this.f22702d.setEnabled(true);
        this.f22703e.setEnabled(true);
        this.f22710l = new CheckedTextView[this.f22705g.size()][];
        boolean zH = h();
        for (int i10 = 0; i10 < this.f22705g.size(); i10++) {
            d0.a aVar = this.f22705g.get(i10);
            boolean zG = g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f22710l;
            int i11 = aVar.f21424b;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            c[] cVarArr = new c[i11];
            for (int i12 = 0; i12 < aVar.f21424b; i12++) {
                cVarArr[i12] = new c(aVar, i12);
            }
            Comparator<c> comparator = this.f22712n;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                if (i13 == 0) {
                    addView(this.f22701c.inflate(R$layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f22701c.inflate((zG || zH) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f22700b);
                checkedTextView.setText(this.f22709k.a(cVarArr[i13].a()));
                checkedTextView.setTag(cVarArr[i13]);
                if (aVar.g(i13)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f22704f);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f22710l[i10][i13] = checkedTextView;
                addView(checkedTextView);
            }
        }
        i();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f22707i != z10) {
            this.f22707i = z10;
            j();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f22708j != z10) {
            this.f22708j = z10;
            if (!z10 && this.f22706h.size() > 1) {
                Map<e7.g0, q7.w> mapB = b(this.f22706h, this.f22705g, false);
                this.f22706h.clear();
                this.f22706h.putAll(mapB);
            }
            j();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f22702d.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(m0 m0Var) {
        this.f22709k = (m0) s7.a.e(m0Var);
        j();
    }
}
