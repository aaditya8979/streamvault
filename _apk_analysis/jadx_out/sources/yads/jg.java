package yads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jg {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final RectF f91209j = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ConcurrentHashMap f91210k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ConcurrentHashMap f91211l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f91212a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f91213b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f91214c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f91215d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f91216e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextPaint f91217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f91218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f91219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ig f91220i;

    public jg(TextView textView) {
        this.f91218g = textView;
        this.f91219h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f91220i = new hg();
        } else {
            this.f91220i = new gg();
        }
    }

    public static Object a(Object obj, String str, Object obj2) {
        try {
            return b(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public static Method b(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f91210k;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public final int a(RectF rectF) {
        CharSequence transformation;
        int length = this.f91216e.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 1;
        int i12 = 0;
        while (i11 <= i10) {
            int i13 = (i11 + i10) / 2;
            int i14 = this.f91216e[i13];
            CharSequence text = this.f91218g.getText();
            TransformationMethod transformationMethod = this.f91218g.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f91218g)) != null) {
                text = transformation;
            }
            int maxLines = this.f91218g.getMaxLines();
            TextPaint textPaint = this.f91217f;
            if (textPaint == null) {
                this.f91217f = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f91217f.set(this.f91218g.getPaint());
            this.f91217f.setTextSize(i14);
            Layout.Alignment alignment = (Layout.Alignment) a(this.f91218g, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f91217f, Math.round(rectF.right));
            builderObtain.setAlignment(alignment).setLineSpacing(this.f91218g.getLineSpacingExtra(), this.f91218g.getLineSpacingMultiplier()).setIncludePad(this.f91218g.getIncludeFontPadding()).setBreakStrategy(this.f91218g.getBreakStrategy()).setHyphenationFrequency(this.f91218g.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            try {
                this.f91220i.a(builderObtain, this.f91218g);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            StaticLayout staticLayoutBuild = builderObtain.build();
            if ((maxLines == -1 || (staticLayoutBuild.getLineCount() <= maxLines && staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) == text.length())) && staticLayoutBuild.getHeight() <= rectF.bottom) {
                int i15 = i13 + 1;
                i12 = i11;
                i11 = i15;
            } else {
                i12 = i13 - 1;
                i10 = i12;
            }
        }
        return this.f91216e[i12];
    }

    public final void a() {
        TextView textView = this.f91218g;
        if (!(!(textView instanceof EditText)) || this.f91212a == 0) {
            return;
        }
        if (this.f91213b) {
            if (textView.getMeasuredHeight() <= 0 || this.f91218g.getMeasuredWidth() <= 0) {
                return;
            }
            int measuredWidth = this.f91220i.a(this.f91218g) ? 1048576 : (this.f91218g.getMeasuredWidth() - this.f91218g.getTotalPaddingLeft()) - this.f91218g.getTotalPaddingRight();
            int height = (this.f91218g.getHeight() - this.f91218g.getCompoundPaddingBottom()) - this.f91218g.getCompoundPaddingTop();
            if (measuredWidth <= 0 || height <= 0) {
                return;
            }
            RectF rectF = f91209j;
            synchronized (rectF) {
                rectF.setEmpty();
                rectF.right = measuredWidth;
                rectF.bottom = height;
                float fA = a(rectF);
                if (fA != this.f91218g.getTextSize()) {
                    a(0, fA);
                }
            }
        }
        this.f91213b = true;
    }

    public final void a(int i10, float f10) {
        Context context = this.f91219h;
        float fApplyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (fApplyDimension != this.f91218g.getPaint().getTextSize()) {
            this.f91218g.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = this.f91218g.isInLayout();
            if (this.f91218g.getLayout() != null) {
                this.f91213b = false;
                try {
                    Method methodB = b("nullLayouts");
                    if (methodB != null) {
                        methodB.invoke(this.f91218g, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    this.f91218g.forceLayout();
                } else {
                    this.f91218g.requestLayout();
                }
                this.f91218g.invalidate();
            }
        }
    }
}
