package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public class AutoNextLineLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f82546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f82547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Hashtable f82548e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f82550b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f82551c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f82552d;

        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }
    }

    public AutoNextLineLinearLayout(Context context) {
        super(context);
        this.f82548e = new Hashtable();
    }

    public AutoNextLineLinearLayout(Context context, int i10, int i11) {
        super(context);
        this.f82548e = new Hashtable();
    }

    public AutoNextLineLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82548e = new Hashtable();
    }

    private int a(int i10, int i11) {
        if (i10 <= 0) {
            return getPaddingLeft();
        }
        int i12 = i11 - 1;
        return a(i10 - 1, i12) + getChildAt(i12).getMeasuredWidth() + 30;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LinearLayout.LayoutParams(0, 0);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a aVar = (a) this.f82548e.get(childAt);
            if (aVar != null) {
                childAt.layout(aVar.f82549a, aVar.f82550b, aVar.f82551c, aVar.f82552d);
            } else {
                Log.i("MyLayout", "error");
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int childCount = getChildCount();
        byte b10 = 0;
        this.f82544a = 0;
        this.f82545b = 0;
        this.f82546c = 5;
        this.f82547d = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            childAt.measure(0, 0);
            int measuredWidth = childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight();
            i13 += measuredWidth;
            a aVar = new a(b10);
            int iA = a(i12 - i14, i12);
            this.f82544a = iA;
            this.f82545b = iA + childAt.getMeasuredWidth();
            if (i13 >= size) {
                this.f82544a = 0;
                this.f82545b = childAt.getMeasuredWidth() + 0;
                this.f82546c = i15 + measuredHeight + layoutParams.topMargin;
                i14 = i12;
                i13 = measuredWidth;
            }
            int measuredHeight2 = this.f82546c + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
            this.f82547d = measuredHeight2;
            int i16 = this.f82546c;
            aVar.f82549a = this.f82544a;
            aVar.f82550b = i16 + 3;
            aVar.f82551c = this.f82545b;
            aVar.f82552d = measuredHeight2;
            this.f82548e.put(childAt, aVar);
            i12++;
            i15 = i16;
        }
        setMeasuredDimension(size, this.f82547d);
    }
}
