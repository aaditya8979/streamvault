package com.mgs.carparking.shorttk;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.util.PatternsCompat;
import com.dramarush.shortin.R;
import com.ironsource.C3978d4;
import com.ironsource.Z7;
import com.mgs.carparking.R$styleable;
import com.mgs.carparking.shorttk.a;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class ExpandableTextView extends AppCompatTextView {
    public static String K = "收起";
    public static String L = "展开";
    public static String M = "网页链接";
    public static final String N = "图" + M;
    public static int O = 0;
    public int A;
    public int B;
    public int C;
    public String D;
    public String E;
    public String F;
    public int G;
    public boolean H;
    public boolean I;
    public k J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextPaint f44349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f44351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jc.d f44352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DynamicLayout f44353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f44357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f44358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f44359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f44360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f44361n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.mgs.carparking.shorttk.a f44362o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f44363p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f44364q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f44365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f44366s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f44367t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f44368u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f44369v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f44370w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f44371x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f44372y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f44373z;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (!ExpandableTextView.this.H) {
                ExpandableTextView.this.C();
            }
            ExpandableTextView.this.H = true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExpandableTextView.o();
            ExpandableTextView expandableTextView = ExpandableTextView.this;
            expandableTextView.setContent(expandableTextView.f44371x.toString());
        }
    }

    public class c extends ClickableSpan {
        public c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (ExpandableTextView.this.f44359l) {
                if (ExpandableTextView.this.f44352e != null) {
                    ExpandableTextView.this.f44352e.a(StatusType.STATUS_CONTRACT);
                    ExpandableTextView expandableTextView = ExpandableTextView.this;
                    expandableTextView.x(expandableTextView.f44352e.getStatus());
                } else {
                    ExpandableTextView.this.w();
                }
            }
            if (ExpandableTextView.this.f44360m != null) {
                ExpandableTextView.this.f44360m.a(StatusType.STATUS_EXPAND);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(ExpandableTextView.this.f44372y);
            textPaint.setUnderlineText(false);
        }
    }

    public class d extends ClickableSpan {
        public d() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (ExpandableTextView.this.f44352e != null) {
                ExpandableTextView.this.f44352e.a(StatusType.STATUS_EXPAND);
                ExpandableTextView expandableTextView = ExpandableTextView.this;
                expandableTextView.x(expandableTextView.f44352e.getStatus());
            } else {
                ExpandableTextView.this.w();
            }
            if (ExpandableTextView.this.f44360m != null) {
                ExpandableTextView.this.f44360m.a(StatusType.STATUS_CONTRACT);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(ExpandableTextView.this.C);
            textPaint.setUnderlineText(false);
        }
    }

    public class e extends ClickableSpan {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.C0538a f44378b;

        public e(a.C0538a c0538a) {
            this.f44378b = c0538a;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (ExpandableTextView.this.f44358k != null) {
                ExpandableTextView.this.f44358k.a(LinkType.SELF, this.f44378b.b(), this.f44378b.c());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ExpandableTextView.this.B);
            textPaint.setUnderlineText(false);
        }
    }

    public class f extends ClickableSpan {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.C0538a f44380b;

        public f(a.C0538a c0538a) {
            this.f44380b = c0538a;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (ExpandableTextView.this.f44358k != null) {
                ExpandableTextView.this.f44358k.a(LinkType.MENTION_TYPE, this.f44380b.e(), null);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ExpandableTextView.this.f44373z);
            textPaint.setUnderlineText(false);
        }
    }

    public class g extends ClickableSpan {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.C0538a f44382b;

        public g(a.C0538a c0538a) {
            this.f44382b = c0538a;
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (intent == null) {
                return;
            }
            context.startActivity(intent);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (ExpandableTextView.this.f44358k != null) {
                ExpandableTextView.this.f44358k.a(LinkType.LINK_TYPE, this.f44382b.e(), null);
                return;
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setFlags(268435456);
            intent.setData(Uri.parse(this.f44382b.e()));
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(ExpandableTextView.this.f44351d, intent);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ExpandableTextView.this.A);
            textPaint.setUnderlineText(false);
        }
    }

    public class h implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f44384b;

        public h(boolean z10) {
            this.f44384b = z10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Float f10 = (Float) valueAnimator.getAnimatedValue();
            if (this.f44384b) {
                ExpandableTextView expandableTextView = ExpandableTextView.this;
                expandableTextView.f44355h = expandableTextView.f44354g + ((int) ((ExpandableTextView.this.f44370w - ExpandableTextView.this.f44354g) * f10.floatValue()));
            } else if (ExpandableTextView.this.f44361n) {
                ExpandableTextView expandableTextView2 = ExpandableTextView.this;
                expandableTextView2.f44355h = expandableTextView2.f44354g + ((int) ((ExpandableTextView.this.f44370w - ExpandableTextView.this.f44354g) * (1.0f - f10.floatValue())));
            }
            ExpandableTextView expandableTextView3 = ExpandableTextView.this;
            expandableTextView3.setText(expandableTextView3.G(expandableTextView3.f44371x));
        }
    }

    public static class i extends LinkMovementMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static i f44386a;

        public static i a() {
            if (f44386a == null) {
                f44386a = new i();
            }
            return f44386a;
        }

        @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 1 && action != 0) {
                return Touch.onTouchEvent(textView, spannable, motionEvent);
            }
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int totalPaddingLeft = x10 - textView.getTotalPaddingLeft();
            int totalPaddingTop = y10 - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length == 0) {
                Selection.removeSelection(spannable);
                Touch.onTouchEvent(textView, spannable, motionEvent);
                return false;
            }
            if (action == 1) {
                clickableSpanArr[0].onClick(textView);
            } else if (action == 0) {
                Selection.setSelection(spannable, spannable.getSpanStart(clickableSpanArr[0]), spannable.getSpanEnd(clickableSpanArr[0]));
            }
            if (textView instanceof ExpandableTextView) {
                ((ExpandableTextView) textView).f44350c = true;
            }
            return true;
        }
    }

    public interface j {
        void a(StatusType statusType);
    }

    public interface k {
        void a(int i10, boolean z10);
    }

    public interface l {
        void a(LinkType linkType, String str, String str2);
    }

    public class m extends ImageSpan {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Drawable f44387b;

        public m(Drawable drawable, int i10) {
            super(drawable, i10);
            this.f44387b = drawable;
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @NonNull Paint paint) {
            Drawable drawable = getDrawable();
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i15 = ((((fontMetricsInt.descent + i13) + i13) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
            canvas.save();
            canvas.translate(f10, i15);
            drawable.draw(canvas);
            canvas.restore();
        }

        @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
        public Drawable getDrawable() {
            return this.f44387b;
        }
    }

    public ExpandableTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ExpandableTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f44357j = null;
        this.f44359l = true;
        this.f44361n = true;
        this.f44363p = true;
        this.f44364q = true;
        this.f44365r = true;
        this.f44366s = true;
        this.f44367t = false;
        this.f44368u = false;
        this.f44369v = true;
        this.I = true;
        F(context, attributeSet, i10);
        setMovementMethod(i.a());
        addOnAttachStateChangeListener(new a());
    }

    private String getExpandEndContent() {
        return TextUtils.isEmpty(this.F) ? String.format(Locale.getDefault(), "  %s", this.E) : String.format(Locale.getDefault(), "  %s  %s", this.F, this.E);
    }

    private String getHideEndContent() {
        if (TextUtils.isEmpty(this.F)) {
            return String.format(Locale.getDefault(), this.f44368u ? "  %s" : "...  %s", this.D);
        }
        return String.format(Locale.getDefault(), this.f44368u ? "  %s  %s" : "...  %s  %s", this.F, this.D);
    }

    public static /* synthetic */ int o() {
        int i10 = O;
        O = i10 + 1;
        return i10;
    }

    public final void A(SpannableStringBuilder spannableStringBuilder, a.C0538a c0538a, int i10) {
        spannableStringBuilder.setSpan(new g(c0538a), c0538a.d() + 1, i10, 17);
    }

    public final SpannableStringBuilder B(com.mgs.carparking.shorttk.a aVar, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        jc.d dVar = this.f44352e;
        if (dVar != null && dVar.getStatus() != null) {
            if (this.f44352e.getStatus() != null && this.f44352e.getStatus().equals(StatusType.STATUS_CONTRACT)) {
                int i10 = this.f44354g;
                this.f44355h = i10 + (this.f44370w - i10);
            } else if (this.f44361n) {
                this.f44355h = this.f44354g;
            }
        }
        if (z10) {
            int i11 = this.f44355h;
            if (i11 < this.f44370w) {
                int i12 = i11 - 1;
                int lineEnd = this.f44353f.getLineEnd(i12);
                int lineStart = this.f44353f.getLineStart(i12);
                float lineWidth = this.f44353f.getLineWidth(i12);
                String hideEndContent = getHideEndContent();
                String strSubstring = aVar.a().substring(0, E(hideEndContent, lineEnd, lineStart, lineWidth, this.f44349b.measureText(hideEndContent), 0.0f));
                if (strSubstring.endsWith("\n")) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                }
                spannableStringBuilder.append((CharSequence) strSubstring);
                if (this.f44368u) {
                    float lineWidth2 = 0.0f;
                    for (int i13 = 0; i13 < i12; i13++) {
                        lineWidth2 += this.f44353f.getLineWidth(i13);
                    }
                    float fMeasureText = ((lineWidth2 / i12) - lineWidth) - this.f44349b.measureText(hideEndContent);
                    if (fMeasureText > 0.0f) {
                        int i14 = 0;
                        while (i14 * this.f44349b.measureText(Z7.f30794r) < fMeasureText) {
                            i14++;
                        }
                        int i15 = i14 - 1;
                        for (int i16 = 0; i16 < i15; i16++) {
                            spannableStringBuilder.append(Z7.f30794r);
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) hideEndContent);
                spannableStringBuilder.setSpan(new c(), (spannableStringBuilder.length() - this.D.length()) - (TextUtils.isEmpty(this.F) ? 0 : this.F.length() + 2), spannableStringBuilder.length(), 17);
            } else {
                spannableStringBuilder.append(aVar.a());
                if (this.f44361n) {
                    String expandEndContent = getExpandEndContent();
                    if (this.f44368u) {
                        int lineCount = this.f44353f.getLineCount() - 1;
                        float lineWidth3 = this.f44353f.getLineWidth(lineCount);
                        float lineWidth4 = 0.0f;
                        for (int i17 = 0; i17 < lineCount; i17++) {
                            lineWidth4 += this.f44353f.getLineWidth(i17);
                        }
                        float fMeasureText2 = ((lineWidth4 / lineCount) - lineWidth3) - this.f44349b.measureText(expandEndContent);
                        if (fMeasureText2 > 0.0f) {
                            int i18 = 0;
                            while (i18 * this.f44349b.measureText(Z7.f30794r) < fMeasureText2) {
                                i18++;
                            }
                            int i19 = i18 - 1;
                            for (int i20 = 0; i20 < i19; i20++) {
                                spannableStringBuilder.append(Z7.f30794r);
                            }
                        }
                    }
                    spannableStringBuilder.append((CharSequence) expandEndContent);
                    spannableStringBuilder.setSpan(new d(), (spannableStringBuilder.length() - this.E.length()) - (TextUtils.isEmpty(this.F) ? 0 : this.F.length() + 2), spannableStringBuilder.length(), 17);
                } else if (!TextUtils.isEmpty(this.F)) {
                    spannableStringBuilder.append(this.F);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.G), spannableStringBuilder.length() - this.F.length(), spannableStringBuilder.length(), 17);
                }
            }
        } else {
            spannableStringBuilder.append(aVar.a());
            if (!TextUtils.isEmpty(this.F)) {
                spannableStringBuilder.append(this.F);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.G), spannableStringBuilder.length() - this.F.length(), spannableStringBuilder.length(), 17);
            }
        }
        for (a.C0538a c0538a : aVar.b()) {
            if (spannableStringBuilder.length() >= c0538a.a()) {
                if (c0538a.getType().equals(LinkType.LINK_TYPE)) {
                    if (this.f44363p && z10) {
                        int length = spannableStringBuilder.length() - getHideEndContent().length();
                        if (c0538a.d() < length) {
                            spannableStringBuilder.setSpan(new m(this.f44357j, 1), c0538a.d(), c0538a.d() + 1, 18);
                            int iA = c0538a.a();
                            if (this.f44355h < this.f44370w && length > c0538a.d() + 1 && length < c0538a.a()) {
                                iA = length;
                            }
                            if (c0538a.d() + 1 < length) {
                                A(spannableStringBuilder, c0538a, iA);
                            }
                        }
                    } else {
                        spannableStringBuilder.setSpan(new m(this.f44357j, 1), c0538a.d(), c0538a.d() + 1, 18);
                        A(spannableStringBuilder, c0538a, c0538a.a());
                    }
                } else if (c0538a.getType().equals(LinkType.MENTION_TYPE)) {
                    if (this.f44363p && z10) {
                        int length2 = spannableStringBuilder.length() - getHideEndContent().length();
                        if (c0538a.d() < length2) {
                            int iA2 = c0538a.a();
                            if (this.f44355h >= this.f44370w || length2 >= c0538a.a()) {
                                length2 = iA2;
                            }
                            y(spannableStringBuilder, c0538a, length2);
                        }
                    } else {
                        y(spannableStringBuilder, c0538a, c0538a.a());
                    }
                } else if (c0538a.getType().equals(LinkType.SELF)) {
                    if (this.f44363p && z10) {
                        int length3 = spannableStringBuilder.length() - getHideEndContent().length();
                        if (c0538a.d() < length3) {
                            int iA3 = c0538a.a();
                            if (this.f44355h >= this.f44370w || length3 >= c0538a.a()) {
                                length3 = iA3;
                            }
                            z(spannableStringBuilder, c0538a, length3);
                        }
                    } else {
                        z(spannableStringBuilder, c0538a, c0538a.a());
                    }
                }
            }
        }
        setHighlightColor(0);
        setText(spannableStringBuilder);
        return spannableStringBuilder;
    }

    public final void C() {
        if (this.f44371x == null) {
            return;
        }
        this.f44355h = this.f44354g;
        if (this.f44356i <= 0 && getWidth() > 0) {
            this.f44356i = (getWidth() - getPaddingLeft()) - getPaddingRight();
        }
        if (this.f44356i > 0) {
            G(this.f44371x.toString());
            return;
        }
        if (O > 10) {
            setText("                                                                                                                                                                                                                                                                                                                           ");
        }
        post(new b());
    }

    public final com.mgs.carparking.shorttk.a D(CharSequence charSequence) {
        int i10;
        int i11;
        com.mgs.carparking.shorttk.a aVar = new com.mgs.carparking.shorttk.a();
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile("\\[([^\\[]*)\\]\\(([^\\(]*)\\)", 2).matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        HashMap map = new HashMap();
        if (this.f44367t) {
            ArrayList arrayList2 = new ArrayList();
            i10 = 0;
            int i12 = 0;
            while (matcher.find()) {
                int iStart = matcher.start();
                int iEnd = matcher.end();
                stringBuffer.append(charSequence.toString().substring(i12, iStart));
                String strGroup = matcher.group();
                if (!TextUtils.isEmpty(strGroup)) {
                    String strSubstring = strGroup.substring(strGroup.indexOf(C3978d4.j.f31383d) + 1, strGroup.indexOf(C3978d4.j.f31385e));
                    String strSubstring2 = strGroup.substring(strGroup.indexOf("(") + 1, strGroup.indexOf(")"));
                    String strA = jc.k.a(strSubstring.length());
                    arrayList2.add(new a.C0538a(stringBuffer.length() + 1, stringBuffer.length() + 2 + strSubstring.length(), strSubstring, strSubstring2, LinkType.SELF));
                    map.put(strA, strSubstring);
                    stringBuffer.append(Z7.f30794r + strA + Z7.f30794r);
                    i12 = iEnd;
                }
                i10 = iEnd;
            }
            arrayList.addAll(arrayList2);
        } else {
            i10 = 0;
        }
        stringBuffer.append(charSequence.toString().substring(i10, charSequence.toString().length()));
        String string = stringBuffer.toString();
        StringBuffer stringBuffer2 = new StringBuffer();
        if (this.f44366s) {
            Matcher matcher2 = PatternsCompat.AUTOLINK_WEB_URL.matcher(string);
            i11 = 0;
            int i13 = 0;
            while (matcher2.find()) {
                int iStart2 = matcher2.start();
                int iEnd2 = matcher2.end();
                stringBuffer2.append(string.toString().substring(i13, iStart2));
                if (this.f44364q) {
                    int length = stringBuffer2.length() + 1;
                    int length2 = stringBuffer2.length() + 2;
                    String str = N;
                    arrayList.add(new a.C0538a(length, length2 + str.length(), matcher2.group(), LinkType.LINK_TYPE));
                    stringBuffer2.append(Z7.f30794r + str + Z7.f30794r);
                } else {
                    String strGroup2 = matcher2.group();
                    String strA2 = jc.k.a(strGroup2.length());
                    arrayList.add(new a.C0538a(stringBuffer2.length(), stringBuffer2.length() + 2 + strA2.length(), strGroup2, LinkType.LINK_TYPE));
                    map.put(strA2, strGroup2);
                    stringBuffer2.append(Z7.f30794r + strA2 + Z7.f30794r);
                }
                i11 = iEnd2;
                i13 = i11;
            }
        } else {
            i11 = 0;
        }
        stringBuffer2.append(string.toString().substring(i11, string.toString().length()));
        if (this.f44365r) {
            Matcher matcher3 = Pattern.compile("@[\\w\\p{InCJKUnifiedIdeographs}-]{1,26}", 2).matcher(stringBuffer2.toString());
            ArrayList arrayList3 = new ArrayList();
            while (matcher3.find()) {
                arrayList3.add(new a.C0538a(matcher3.start(), matcher3.end(), matcher3.group(), LinkType.MENTION_TYPE));
            }
            arrayList.addAll(0, arrayList3);
        }
        if (!map.isEmpty()) {
            String string2 = stringBuffer2.toString();
            for (Map.Entry entry : map.entrySet()) {
                string2 = string2.replaceAll((String) entry.getKey(), (String) entry.getValue());
            }
            stringBuffer2 = new StringBuffer(string2);
        }
        aVar.c(stringBuffer2.toString());
        aVar.d(arrayList);
        return aVar;
    }

    public final int E(String str, int i10, int i11, float f10, float f11, float f12) {
        int i12 = (int) (((f10 - (f11 + f12)) * (i10 - i11)) / f10);
        if (i12 <= str.length()) {
            return i10;
        }
        int i13 = i12 + i11;
        return this.f44349b.measureText(this.f44362o.a().substring(i11, i13)) <= f10 - f11 ? i13 : E(str, i10, i11, f10, f11, f12 + this.f44349b.measureText(Z7.f30794r));
    }

    public final void F(Context context, AttributeSet attributeSet, int i10) {
        K = context.getString(R.string.social_contract);
        L = context.getString(R.string.social_expend);
        M = context.getString(R.string.social_text_target);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ExpandableTextView, i10, 0);
            this.f44354g = typedArrayObtainStyledAttributes.getInt(7, 4);
            this.f44363p = typedArrayObtainStyledAttributes.getBoolean(13, true);
            this.f44361n = typedArrayObtainStyledAttributes.getBoolean(11, false);
            this.f44369v = typedArrayObtainStyledAttributes.getBoolean(10, true);
            this.f44367t = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f44365r = typedArrayObtainStyledAttributes.getBoolean(15, true);
            this.f44366s = typedArrayObtainStyledAttributes.getBoolean(14, true);
            this.f44368u = typedArrayObtainStyledAttributes.getBoolean(9, false);
            this.f44364q = typedArrayObtainStyledAttributes.getBoolean(12, true);
            this.E = typedArrayObtainStyledAttributes.getString(1);
            String string = typedArrayObtainStyledAttributes.getString(4);
            this.D = string;
            if (TextUtils.isEmpty(string)) {
                this.D = L;
            }
            if (TextUtils.isEmpty(this.E)) {
                this.E = K;
            }
            this.f44372y = typedArrayObtainStyledAttributes.getColor(3, Color.parseColor("#999999"));
            this.G = typedArrayObtainStyledAttributes.getColor(3, Color.parseColor("#999999"));
            this.C = typedArrayObtainStyledAttributes.getColor(0, Color.parseColor("#999999"));
            this.A = typedArrayObtainStyledAttributes.getColor(5, Color.parseColor("#FF6200"));
            this.B = typedArrayObtainStyledAttributes.getColor(17, Color.parseColor("#FF6200"));
            this.f44373z = typedArrayObtainStyledAttributes.getColor(8, Color.parseColor("#FF6200"));
            this.f44357j = getResources().getDrawable(typedArrayObtainStyledAttributes.getResourceId(6, R.drawable.bg_ad_extension_share));
            this.f44355h = this.f44354g;
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f44357j = context.getResources().getDrawable(R.drawable.bg_ad_extension_share);
        }
        this.f44351d = context;
        TextPaint paint = getPaint();
        this.f44349b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f44357j.setBounds(0, 0, 30, 30);
    }

    public final SpannableStringBuilder G(CharSequence charSequence) {
        this.f44362o = D(charSequence);
        DynamicLayout dynamicLayout = new DynamicLayout(this.f44362o.a(), this.f44349b, this.f44356i, Layout.Alignment.ALIGN_NORMAL, 1.2f, 0.0f, true);
        this.f44353f = dynamicLayout;
        int lineCount = dynamicLayout.getLineCount();
        this.f44370w = lineCount;
        k kVar = this.J;
        if (kVar != null) {
            kVar.a(lineCount, lineCount > this.f44354g);
        }
        return (!this.f44363p || this.f44370w <= this.f44354g) ? B(this.f44362o, false) : B(this.f44362o, true);
    }

    public String getContractString() {
        return this.E;
    }

    public int getContractTextColor() {
        return this.C;
    }

    public int getEndExpandTextColor() {
        return this.G;
    }

    public j getExpandOrContractClickListener() {
        return this.f44360m;
    }

    public String getExpandString() {
        return this.D;
    }

    public int getExpandTextColor() {
        return this.f44372y;
    }

    public int getExpandableLineCount() {
        return this.f44370w;
    }

    public int getExpandableLinkTextColor() {
        return this.A;
    }

    public l getLinkClickListener() {
        return this.f44358k;
    }

    public Drawable getLinkDrawable() {
        return this.f44357j;
    }

    public k getOnGetLineCountListener() {
        return this.J;
    }

    public int getSelfTextColor() {
        return this.B;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        this.f44350c = false;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (this.I) {
            return this.f44350c;
        }
        if (action == 1) {
            setTextIsSelectable(false);
        }
        return zOnTouchEvent;
    }

    public void setContent(String str) {
        this.f44371x = str;
        if (this.H) {
            C();
        }
    }

    public void setContractString(String str) {
        this.E = str;
    }

    public void setContractTextColor(int i10) {
        this.C = i10;
    }

    public void setCurrStatus(StatusType statusType) {
        x(statusType);
    }

    public void setEndExpandTextColor(int i10) {
        this.G = i10;
    }

    public void setEndExpendContent(String str) {
        this.F = str;
    }

    public void setExpandOrContractClickListener(j jVar) {
        this.f44360m = jVar;
    }

    public void setExpandString(String str) {
        this.D = str;
    }

    public void setExpandTextColor(int i10) {
        this.f44372y = i10;
    }

    public void setExpandableLineCount(int i10) {
        this.f44370w = i10;
    }

    public void setExpandableLinkTextColor(int i10) {
        this.A = i10;
    }

    public void setLinkClickListener(l lVar) {
        this.f44358k = lVar;
    }

    public void setLinkDrawable(Drawable drawable) {
        this.f44357j = drawable;
    }

    public void setNeedAlwaysShowRight(boolean z10) {
        this.f44368u = z10;
    }

    public void setNeedAnimation(boolean z10) {
        this.f44369v = z10;
    }

    public void setNeedContract(boolean z10) {
        this.f44361n = z10;
    }

    public void setNeedExpend(boolean z10) {
        this.f44363p = z10;
    }

    public void setNeedLink(boolean z10) {
        this.f44366s = z10;
    }

    public void setNeedMention(boolean z10) {
        this.f44365r = z10;
    }

    public void setNeedSelf(boolean z10) {
        this.f44367t = z10;
    }

    public void setOnGetLineCountListener(k kVar) {
        this.J = kVar;
    }

    public void setSelfTextColor(int i10) {
        this.B = i10;
    }

    public final void w() {
        x(null);
    }

    public final void x(StatusType statusType) {
        int i10 = this.f44355h;
        int i11 = this.f44370w;
        boolean z10 = i10 < i11;
        if (statusType != null) {
            this.f44369v = false;
        }
        if (this.f44369v) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new h(z10));
            valueAnimatorOfFloat.setDuration(100L);
            valueAnimatorOfFloat.start();
            return;
        }
        if (z10) {
            int i12 = this.f44354g;
            this.f44355h = i12 + (i11 - i12);
        } else if (this.f44361n) {
            this.f44355h = this.f44354g;
        }
        setText(G(this.f44371x));
    }

    public final void y(SpannableStringBuilder spannableStringBuilder, a.C0538a c0538a, int i10) {
        spannableStringBuilder.setSpan(new f(c0538a), c0538a.d(), i10, 17);
    }

    public final void z(SpannableStringBuilder spannableStringBuilder, a.C0538a c0538a, int i10) {
        spannableStringBuilder.setSpan(new e(c0538a), c0538a.d(), i10, 17);
    }
}
