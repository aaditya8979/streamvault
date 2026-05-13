package com.google.android.exoplayer.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.Nullable;
import chuangyuan.ycj.videolibrary.R$layout;
import chuangyuan.ycj.videolibrary.R$string;
import com.google.android.exoplayer.source.TrackGroup;
import com.google.android.exoplayer.source.TrackGroupArray;
import com.google.android.exoplayer.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer.trackselection.b;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import x5.d;

/* JADX INFO: loaded from: classes6.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflater f20982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckedTextView f20983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CheckedTextView f20984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f20985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray<DefaultTrackSelector.SelectionOverride> f20986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f20989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CheckedTextView[][] f20990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b.a f20991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f20992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TrackGroupArray f20993n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f20994o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public c f20995p;

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.e(view);
        }
    }

    public interface c {
        void b(boolean z10, List<DefaultTrackSelector.SelectionOverride> list);
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        this.f20986g = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f20981b = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f20982c = layoutInflaterFrom;
        b bVar = new b();
        this.f20985f = bVar;
        this.f20989j = new x5.a(getResources());
        this.f20993n = TrackGroupArray.f20391e;
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f20983d = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R$string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(R$layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f20984e = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R$string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    public static int[] b(int[] iArr, int i10) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArrCopyOf.length - 1] = i10;
        return iArrCopyOf;
    }

    public static int[] c(int[] iArr, int i10) {
        int[] iArr2 = new int[iArr.length - 1];
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 != i10) {
                iArr2[i11] = i12;
                i11++;
            }
        }
        return iArr2;
    }

    public void d(b.a aVar, int i10, boolean z10, List<DefaultTrackSelector.SelectionOverride> list, @Nullable c cVar) {
        this.f20991l = aVar;
        this.f20992m = i10;
        this.f20994o = z10;
        this.f20995p = cVar;
        int size = this.f20988i ? list.size() : Math.min(list.size(), 1);
        for (int i11 = 0; i11 < size; i11++) {
            DefaultTrackSelector.SelectionOverride selectionOverride = list.get(i11);
            this.f20986g.put(selectionOverride.f20783b, selectionOverride);
        }
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(View view) {
        if (view == this.f20983d) {
            g();
        } else if (view == this.f20984e) {
            f();
        } else {
            h(view);
        }
        k();
        c cVar = this.f20995p;
        if (cVar != null) {
            cVar.b(getIsDisabled(), getOverrides());
        }
    }

    public final void f() {
        this.f20994o = false;
        this.f20986g.clear();
    }

    public final void g() {
        this.f20994o = true;
        this.f20986g.clear();
    }

    public boolean getIsDisabled() {
        return this.f20994o;
    }

    public List<DefaultTrackSelector.SelectionOverride> getOverrides() {
        ArrayList arrayList = new ArrayList(this.f20986g.size());
        for (int i10 = 0; i10 < this.f20986g.size(); i10++) {
            arrayList.add(this.f20986g.valueAt(i10));
        }
        return arrayList;
    }

    public final void h(View view) {
        this.f20994o = false;
        Pair pair = (Pair) view.getTag();
        int iIntValue = ((Integer) pair.first).intValue();
        int iIntValue2 = ((Integer) pair.second).intValue();
        DefaultTrackSelector.SelectionOverride selectionOverride = this.f20986g.get(iIntValue);
        a6.a.e(this.f20991l);
        if (selectionOverride == null) {
            if (!this.f20988i && this.f20986g.size() > 0) {
                this.f20986g.clear();
            }
            this.f20986g.put(iIntValue, new DefaultTrackSelector.SelectionOverride(iIntValue, iIntValue2));
            return;
        }
        int i10 = selectionOverride.f20785d;
        int[] iArr = selectionOverride.f20784c;
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zI = i(iIntValue);
        boolean z10 = zI || j();
        if (zIsChecked && z10) {
            if (i10 == 1) {
                this.f20986g.remove(iIntValue);
                return;
            } else {
                this.f20986g.put(iIntValue, new DefaultTrackSelector.SelectionOverride(iIntValue, c(iArr, iIntValue2)));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (zI) {
            this.f20986g.put(iIntValue, new DefaultTrackSelector.SelectionOverride(iIntValue, b(iArr, iIntValue2)));
        } else {
            this.f20986g.put(iIntValue, new DefaultTrackSelector.SelectionOverride(iIntValue, iIntValue2));
        }
    }

    public final boolean i(int i10) {
        return this.f20987h && this.f20993n.b(i10).f20388b > 1 && this.f20991l.a(this.f20992m, i10, false) != 0;
    }

    public final boolean j() {
        return this.f20988i && this.f20993n.f20392b > 1;
    }

    public final void k() {
        this.f20983d.setChecked(this.f20994o);
        this.f20984e.setChecked(!this.f20994o && this.f20986g.size() == 0);
        for (int i10 = 0; i10 < this.f20990k.length; i10++) {
            DefaultTrackSelector.SelectionOverride selectionOverride = this.f20986g.get(i10);
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f20990k[i10];
                if (i11 < checkedTextViewArr.length) {
                    checkedTextViewArr[i11].setChecked(selectionOverride != null && selectionOverride.b(i11));
                    i11++;
                }
            }
        }
    }

    public final void l() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f20991l == null) {
            this.f20983d.setEnabled(false);
            this.f20984e.setEnabled(false);
            return;
        }
        this.f20983d.setEnabled(true);
        this.f20984e.setEnabled(true);
        TrackGroupArray trackGroupArrayE = this.f20991l.e(this.f20992m);
        this.f20993n = trackGroupArrayE;
        this.f20990k = new CheckedTextView[trackGroupArrayE.f20392b][];
        boolean zJ = j();
        int i10 = 0;
        while (true) {
            TrackGroupArray trackGroupArray = this.f20993n;
            if (i10 >= trackGroupArray.f20392b) {
                k();
                return;
            }
            TrackGroup trackGroupB = trackGroupArray.b(i10);
            boolean zI = i(i10);
            this.f20990k[i10] = new CheckedTextView[trackGroupB.f20388b];
            for (int i11 = 0; i11 < trackGroupB.f20388b; i11++) {
                if (i11 == 0) {
                    addView(this.f20982c.inflate(R$layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f20982c.inflate((zI || zJ) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f20981b);
                checkedTextView.setText(this.f20989j.a(trackGroupB.b(i11)));
                if (this.f20991l.f(this.f20992m, i10, i11) == 4) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setTag(Pair.create(Integer.valueOf(i10), Integer.valueOf(i11)));
                    checkedTextView.setOnClickListener(this.f20985f);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f20990k[i10][i11] = checkedTextView;
                addView(checkedTextView);
            }
            i10++;
        }
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
        if (this.f20987h != z10) {
            this.f20987h = z10;
            l();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f20988i != z10) {
            this.f20988i = z10;
            if (!z10 && this.f20986g.size() > 1) {
                for (int size = this.f20986g.size() - 1; size > 0; size--) {
                    this.f20986g.remove(size);
                }
            }
            l();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.f20983d.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(d dVar) {
        this.f20989j = (d) a6.a.e(dVar);
        l();
    }
}
