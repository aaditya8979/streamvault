package sg.bigo.ads.common.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes6.dex */
public class MixtureTextView extends RelativeLayout {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static int[] f82573s = {R.attr.textSize, R.attr.textColor, R.attr.text};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Layout f82574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f82575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f82576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f82577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f82578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextPaint f82579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<List<Rect>> f82580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<Integer> f82581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Layout> f82582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Integer> f82583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private HashSet<Integer> f82584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f82585l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f82586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f82587n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f82588o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f82589p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f82590q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f82591r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Map<Integer, Point> f82592t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a f82593u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f82594v;

    public interface a {
        void a(UnderlineSpan underlineSpan);
    }

    public MixtureTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82574a = null;
        this.f82576c = -9601400;
        this.f82580g = new ArrayList();
        this.f82581h = null;
        this.f82582i = new ArrayList();
        this.f82583j = new ArrayList();
        this.f82584k = new HashSet<>();
        this.f82592t = new HashMap();
        this.f82594v = true;
        this.f82577d = e.b(getContext(), 14);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f82573s);
        this.f82577d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.f82577d);
        this.f82576c = typedArrayObtainStyledAttributes.getColor(1, this.f82576c);
        this.f82578e = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f82579f = textPaint;
        textPaint.setDither(true);
        this.f82579f.setAntiAlias(true);
        this.f82579f.setColor(this.f82576c);
        if (TextUtils.isEmpty(this.f82578e)) {
            return;
        }
        this.f82590q = true;
    }

    private static CharSequence a(CharSequence charSequence, int i10, int i11) {
        if (q.a(charSequence)) {
            return null;
        }
        if (!(charSequence instanceof SpannableString)) {
            if (charSequence instanceof String) {
                return ((String) charSequence).substring(i10, i11);
            }
            return null;
        }
        SpannableString spannableString = (SpannableString) charSequence;
        SpannableString spannableString2 = new SpannableString(TextUtils.substring(spannableString, i10, i11));
        Object[] spans = spannableString.getSpans(i10, i11, Object.class);
        for (int length = spans.length - 1; length >= 0; length--) {
            Object obj = spans[length];
            int spanStart = spannableString.getSpanStart(obj) - i10;
            int spanEnd = spannableString.getSpanEnd(obj) - i10;
            try {
                int length2 = spannableString2.length();
                boolean z10 = false;
                if (spanEnd >= spanStart && spanStart <= length2 && spanEnd <= length2 && spanStart >= 0) {
                    z10 = true;
                }
                if (z10) {
                    spannableString2.setSpan(obj, spanStart, spanEnd, 33);
                }
            } catch (Exception unused) {
            }
        }
        return spannableString2;
    }

    private List<Rect> a(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            Point point = this.f82592t.get(Integer.valueOf(i12));
            int i13 = point.x;
            int i14 = point.y;
            if (i13 <= i10 && i14 >= i11) {
                arrayList.add(new Rect(childAt.getLeft(), i10, childAt.getRight(), i11));
            }
        }
        Collections.sort(arrayList, new Comparator<Rect>() { // from class: sg.bigo.ads.common.view.MixtureTextView.1
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Rect rect, Rect rect2) {
                return rect.left > rect2.left ? 1 : -1;
            }
        });
        if (arrayList.size() < 2) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Rect rect = (Rect) arrayList.get(0);
        Rect rect2 = (Rect) arrayList.get(1);
        for (int i15 = 1; i15 < arrayList.size(); i15++) {
            if (!Rect.intersects(rect, rect2)) {
                if (arrayList2.size() - i15 < 2) {
                    break;
                }
                Rect rect3 = rect2;
                rect2 = (Rect) arrayList.get(i15 + 1);
                rect = rect3;
            } else {
                int iMin = Math.min(rect.left, rect2.left);
                int iMax = Math.max(rect.right, rect2.right);
                arrayList2.remove(rect);
                arrayList2.remove(rect2);
                arrayList2.add(new Rect(iMin, i10, iMax, i11));
                if (arrayList2.size() < 2) {
                    break;
                }
                rect = (Rect) arrayList.get(0);
                rect2 = (Rect) arrayList.get(1);
            }
        }
        return arrayList2;
    }

    private static void a(Rect rect, List<Rect> list, int i10, int i11, int i12) {
        if (rect.right < i12) {
            list.add(new Rect(rect.right, i10, i12, i11));
        }
    }

    private boolean a(Canvas canvas) {
        boolean z10 = canvas == null;
        int i10 = this.f82575b;
        List<List<Rect>> list = this.f82580g;
        CharSequence charSequence = this.f82578e;
        int length = charSequence != null ? charSequence.length() : 0;
        int lineEnd = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            Rect rect = list.get(i12).get(0);
            int iWidth = rect.width();
            int iHeight = rect.height();
            CharSequence charSequenceA = a(this.f82578e, lineEnd, length);
            StaticLayout staticLayout = (q.a(charSequenceA) || this.f82579f == null) ? null : new StaticLayout(charSequenceA, this.f82579f, iWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f82574a = staticLayout;
            if (staticLayout != null) {
                int iMin = Math.min(staticLayout.getLineCount(), iHeight / i10);
                if (!z10) {
                    canvas.save();
                    canvas.translate(rect.left, rect.top);
                    canvas.clipRect(0, 0, rect.width(), this.f82574a.getLineBottom(iMin - 1) - this.f82574a.getLineTop(0));
                    this.f82574a.draw(canvas);
                    canvas.restore();
                }
                lineEnd += this.f82574a.getLineEnd(iMin - 1);
                if (canvas != null) {
                    this.f82582i.add(this.f82574a);
                    this.f82583j.add(Integer.valueOf(iMin));
                }
                i11 += iMin;
                if (lineEnd >= length) {
                    break;
                }
            }
        }
        if (z10) {
            int i13 = this.f82585l + (i11 * i10);
            this.f82585l = i13;
            if (i13 > this.f82591r) {
                int height = getHeight();
                int i14 = this.f82585l;
                if (height != i14 && this.f82587n != 1073741824) {
                    this.f82588o = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                    this.f82589p = true;
                    requestLayout();
                    return true;
                }
            }
        }
        return false;
    }

    private static void b(Rect rect, List<Rect> list, int i10, int i11, int i12) {
        if (rect.left > i12) {
            list.add(new Rect(i12, i10, rect.left, i11));
        }
    }

    private void getAllYCors() {
        int i10 = this.f82575b;
        HashSet<Integer> hashSet = this.f82584k;
        hashSet.clear();
        this.f82592t.clear();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                childAt.getTop();
                int top2 = (((childAt.getTop() - getPaddingTop()) / i10) * i10) + getPaddingTop();
                hashSet.add(Integer.valueOf(top2));
                int bottom = childAt.getBottom() - getPaddingTop();
                if (bottom % i10 != 0) {
                    bottom = ((bottom / i10) + 1) * i10;
                }
                int paddingTop = bottom + getPaddingTop();
                hashSet.add(Integer.valueOf(paddingTop));
                this.f82592t.put(Integer.valueOf(i11), new Point(top2, paddingTop));
            }
        }
        hashSet.add(Integer.valueOf(getPaddingTop()));
        hashSet.add(Integer.valueOf(this.f82587n == 1073741824 ? getHeight() : Integer.MAX_VALUE));
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.f82581h = arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f82585l = getPaddingBottom() + getPaddingTop();
        int i10 = this.f82575b;
        List<List<Rect>> list = this.f82580g;
        List<Integer> list2 = this.f82581h;
        list.clear();
        if (list2 != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= list2.size() - 1) {
                    break;
                }
                int iIntValue = list2.get(i12).intValue();
                i12++;
                int iIntValue2 = list2.get(i12).intValue();
                ArrayList arrayList = new ArrayList();
                List<Rect> listA = a(iIntValue, iIntValue2);
                int size = listA.size();
                if (size == 0) {
                    arrayList.add(new Rect(paddingLeft, iIntValue, width, iIntValue2));
                } else if (size != 1) {
                    b(listA.get(i11), arrayList, iIntValue, iIntValue2, paddingLeft);
                    int i13 = i11;
                    for (int i14 = 1; i13 < listA.size() - i14; i14 = 1) {
                        Rect rect = listA.get(i13);
                        i13++;
                        Rect rect2 = listA.get(i13);
                        if (rect.right < rect2.left) {
                            arrayList.add(new Rect(rect.right, iIntValue, rect2.left, iIntValue2));
                        }
                    }
                    a(listA.get(listA.size() - 1), arrayList, iIntValue, iIntValue2, width);
                } else {
                    Rect rect3 = listA.get(i11);
                    b(rect3, arrayList, iIntValue, iIntValue2, paddingLeft);
                    a(rect3, arrayList, iIntValue, iIntValue2, width);
                }
                list.add(arrayList);
                i11 = 0;
            }
            ArrayList arrayList2 = new ArrayList(list);
            int size2 = list.size();
            int i15 = 0;
            int i16 = 0;
            while (i16 < size2) {
                List<Rect> list3 = list.get(i16);
                if (list3.size() > 1) {
                    int i17 = i15 + i16;
                    arrayList2.remove(list3);
                    i15--;
                    Rect rect4 = list3.get(0);
                    int iHeight = rect4.height() / i10;
                    this.f82585l -= ((list3.size() - 1) * iHeight) * i10;
                    int i18 = i17;
                    int i19 = 0;
                    while (i19 < iHeight) {
                        int i20 = i18;
                        int i21 = 0;
                        while (i21 < list3.size()) {
                            int i22 = i10 * i19;
                            arrayList2.add(i20, Arrays.asList(new Rect(list3.get(i21).left, rect4.top + i22, list3.get(i21).right, rect4.top + i22 + i10)));
                            i21++;
                            i20++;
                            size2 = size2;
                            list = list;
                            list3 = list3;
                            i15++;
                        }
                        i19++;
                        i18 = i20;
                        list = list;
                    }
                }
                i16++;
                size2 = size2;
                list = list;
            }
            this.f82580g = arrayList2;
        }
        if (a(null)) {
            return;
        }
        a(canvas);
        super.dispatchDraw(canvas);
    }

    public CharSequence getText() {
        return this.f82578e;
    }

    public int getTextColor() {
        return this.f82576c;
    }

    public int getTextSize() {
        return this.f82577d;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int offsetForHorizontal;
        a aVar;
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0 && q.b(this.f82578e)) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (!this.f82582i.isEmpty() && !this.f82583j.isEmpty()) {
                int i10 = 0;
                offsetForHorizontal = 0;
                int i11 = 0;
                while (true) {
                    if (i10 >= this.f82582i.size()) {
                        break;
                    }
                    Layout layout = this.f82582i.get(i10);
                    int iIntValue = this.f82583j.get(i10).intValue();
                    if (layout != null) {
                        int lineForVertical = layout.getLineForVertical(y10) + 1;
                        if (lineForVertical <= iIntValue) {
                            offsetForHorizontal += layout.getOffsetForHorizontal(Math.min(lineForVertical - 1, layout.getLineCount() - 1), x10);
                            break;
                        }
                        i11 += iIntValue;
                        y10 -= this.f82575b * i11;
                        offsetForHorizontal += layout.getLineEnd(iIntValue - 1);
                    }
                    i10++;
                }
            } else {
                offsetForHorizontal = 0;
            }
            if (offsetForHorizontal < this.f82578e.length()) {
                CharSequence charSequence = this.f82578e;
                if (charSequence instanceof SpannableString) {
                    UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) ((SpannableString) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, UnderlineSpan.class);
                    if (underlineSpanArr.length > 0 && (aVar = this.f82593u) != null) {
                        aVar.a(underlineSpanArr[0]);
                        return true;
                    }
                }
            }
        }
        return zOnInterceptTouchEvent;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f82594v) {
            this.f82587n = View.MeasureSpec.getMode(this.f82586m);
            this.f82594v = false;
            this.f82591r = getMeasuredHeight();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f82590q) {
            getAllYCors();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f82590q) {
            super.onMeasure(i10, i11);
            return;
        }
        this.f82586m = i11;
        this.f82579f.setTextSize(this.f82577d);
        StaticLayout staticLayout = new StaticLayout("测量行高", this.f82579f, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f82574a = staticLayout;
        this.f82575b = staticLayout.getLineBottom(0) - this.f82574a.getLineTop(0);
        if (this.f82589p) {
            super.onMeasure(i10, this.f82588o);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setClickListener(a aVar) {
        this.f82593u = aVar;
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f82590q = false;
            requestLayout();
        } else {
            this.f82590q = true;
            this.f82578e = charSequence;
            requestLayout();
            invalidate();
        }
    }

    public void setTextColor(int i10) {
        this.f82579f.setColor(i10);
        this.f82576c = i10;
        invalidate();
    }

    public void setTextSize(int i10) {
        this.f82577d = i10;
        this.f82579f.setTextSize(i10);
        requestLayout();
        invalidate();
    }
}
