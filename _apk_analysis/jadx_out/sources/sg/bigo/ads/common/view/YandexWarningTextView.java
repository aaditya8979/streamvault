package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes9.dex */
public class YandexWarningTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f82685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f82686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f82687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f82688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f82689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f82690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f82691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f82692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f82693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f82694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f82695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f82696l;

    public YandexWarningTextView(Context context) {
        super(context);
        this.f82685a = 25;
        this.f82686b = 10;
        this.f82687c = 35.0f;
        this.f82689e = 1;
        this.f82690f = 50.0f;
        this.f82691g = false;
        this.f82692h = 0;
        this.f82693i = 0.0f;
        this.f82694j = 1000;
        this.f82695k = 1000;
        this.f82696l = 1000;
        a(null);
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82685a = 25;
        this.f82686b = 10;
        this.f82687c = 35.0f;
        this.f82689e = 1;
        this.f82690f = 50.0f;
        this.f82691g = false;
        this.f82692h = 0;
        this.f82693i = 0.0f;
        this.f82694j = 1000;
        this.f82695k = 1000;
        this.f82696l = 1000;
        a(attributeSet);
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f82685a = 25;
        this.f82686b = 10;
        this.f82687c = 35.0f;
        this.f82689e = 1;
        this.f82690f = 50.0f;
        this.f82691g = false;
        this.f82692h = 0;
        this.f82693i = 0.0f;
        this.f82694j = 1000;
        this.f82695k = 1000;
        this.f82696l = 1000;
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.YandexWarningTextView);
            this.f82685a = e.d(getContext(), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexWarningTextView_bigo_ad_maxTextSize, this.f82685a));
            this.f82686b = e.d(getContext(), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexWarningTextView_bigo_ad_minTextSize, this.f82686b));
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f82694j = e.c(getContext());
        this.f82695k = e.b(getContext());
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i10 = this.f82689e;
        if (i10 > 2) {
            i10 = 2;
        }
        canvas.save();
        float f10 = (this.f82688d * 1.0f) / i10;
        float f11 = f10 / this.f82690f;
        sg.bigo.ads.common.t.a.a("yandexWarn", "onDraw...singleLineHeight:" + f10 + "...scaleY:" + f11 + "...mPy:" + this.f82693i);
        canvas.scale(1.0f, f11, 0.0f, this.f82693i);
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        try {
            if (TextUtils.isEmpty(getText())) {
                return;
            }
            int paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (i11 - getPaddingTop()) - getPaddingBottom();
            this.f82688d = paddingTop;
            float f10 = this.f82685a;
            float f11 = paddingTop * 0.5f;
            this.f82687c = f11;
            setLineSpacing(f11, 0.0f);
            setTextSize(2, f10);
            StaticLayout staticLayout = new StaticLayout(getText(), getPaint(), paddingLeft, Layout.Alignment.ALIGN_NORMAL, 0.0f, this.f82687c, true);
            while (true) {
                if ((staticLayout.getHeight() <= this.f82688d && staticLayout.getWidth() <= paddingLeft) || f10 <= this.f82686b) {
                    break;
                }
                f10 -= 1.0f;
                setTextSize(2, f10);
                staticLayout = new StaticLayout(getText(), getPaint(), paddingLeft, Layout.Alignment.ALIGN_NORMAL, 0.0f, this.f82687c, true);
            }
            this.f82689e = staticLayout.getLineCount();
            this.f82692h = staticLayout.getLineAscent(0);
            this.f82690f = e.b(getContext(), Math.round(f10));
            int iAbs = Math.abs(this.f82692h);
            boolean z10 = this.f82691g;
            if (z10 || 1 == (i14 = this.f82689e)) {
                if (!z10 || f10 <= 20.0f) {
                    this.f82693i = iAbs / 2.0f;
                } else {
                    this.f82693i = iAbs * 1.1f;
                }
            } else if (i14 >= 3) {
                this.f82693i = 0.0f;
            } else if (f10 > 36.0f) {
                this.f82693i = iAbs * 1.1f;
            } else {
                this.f82693i = (iAbs * 1.0f) / i14;
            }
            if (this.f82695k <= 1000 && this.f82694j <= 1000) {
                this.f82693i = 0.0f;
            }
            setLineSpacing(this.f82690f, 0.0f);
            sg.bigo.ads.common.t.a.a("yandexWarn", "adjust...line " + this.f82689e + "...TextSizeSP:" + f10 + "...TextSizePx:" + this.f82690f + "...TotalHeight:" + this.f82688d + "..lineSpace:" + this.f82687c + "...scaleX:" + getPaint().getTextScaleX() + "...mSecondLineAscentHeight:" + this.f82692h + "...secondLineTopH:" + staticLayout.getLineTop(0) + "...mPy:" + this.f82693i);
        } catch (Throwable unused) {
        }
    }

    public void setIsHorizontal(boolean z10) {
        this.f82691g = z10;
    }
}
