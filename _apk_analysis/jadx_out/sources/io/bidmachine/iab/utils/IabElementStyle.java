package io.bidmachine.iab.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.Z7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class IabElementStyle implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f69386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f69387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f69388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f69389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f69390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f69391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f69392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Float f69393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Float f69394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f69395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Integer f69396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f69397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Integer f69398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Integer f69399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Integer f69400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Integer f69401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Integer f69402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f69403r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Float f69404s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Float f69405t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Float f69406u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f69407v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Float f69408w;

    public IabElementStyle() {
    }

    public IabElementStyle(@Nullable IabElementStyle iabElementStyle) {
        merge(iabElementStyle);
    }

    public void applyAlignment(@NonNull FrameLayout.LayoutParams layoutParams) {
        layoutParams.gravity = positionAsGravity();
    }

    public void applyMargin(@NonNull Context context, @NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        marginLayoutParams.leftMargin = getMarginLeft(context).intValue();
        marginLayoutParams.topMargin = getMarginTop(context).intValue();
        marginLayoutParams.rightMargin = getMarginRight(context).intValue();
        marginLayoutParams.bottomMargin = getMarginBottom(context).intValue();
    }

    public void applyPadding(@NonNull Context context, @NonNull View view) {
        view.setPadding(getPaddingLeft(context).intValue(), getPaddingTop(context).intValue(), getPaddingRight(context).intValue(), getPaddingBottom(context).intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r0 != 17) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void applyRelativeAlignment(@androidx.annotation.NonNull android.widget.RelativeLayout.LayoutParams r4) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.getHorizontalPosition()
            int r0 = r0.intValue()
            r1 = 17
            r2 = 1
            if (r0 == r2) goto L1c
            r2 = 3
            if (r0 == r2) goto L19
            r2 = 5
            if (r0 == r2) goto L16
            if (r0 == r1) goto L1c
            goto L21
        L16:
            r0 = 11
            goto L1e
        L19:
            r0 = 9
            goto L1e
        L1c:
            r0 = 14
        L1e:
            r4.addRule(r0)
        L21:
            java.lang.Integer r0 = r3.getVerticalPosition()
            int r0 = r0.intValue()
            r2 = 16
            if (r0 == r2) goto L3e
            if (r0 == r1) goto L3e
            r1 = 48
            if (r0 == r1) goto L3b
            r1 = 80
            if (r0 == r1) goto L38
            goto L43
        L38:
            r0 = 12
            goto L40
        L3b:
            r0 = 10
            goto L40
        L3e:
            r0 = 15
        L40:
            r4.addRule(r0)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.iab.utils.IabElementStyle.applyRelativeAlignment(android.widget.RelativeLayout$LayoutParams):void");
    }

    @NonNull
    public IabElementStyle copyWith(@Nullable IabElementStyle iabElementStyle) {
        IabElementStyle iabElementStyle2 = new IabElementStyle();
        iabElementStyle2.merge(this);
        iabElementStyle2.merge(iabElementStyle);
        return iabElementStyle2;
    }

    @Nullable
    public String getContent() {
        return this.f69403r;
    }

    @NonNull
    public Integer getFillColor() {
        Integer num = this.f69387b;
        return num != null ? num : Integer.valueOf(Assets.BACKGROUND_COLOR);
    }

    @NonNull
    public Float getFontSize(@NonNull Context context) {
        return Float.valueOf(Utils.dpToPx(context, this.f69408w != null ? r0.floatValue() : 16.0f));
    }

    @NonNull
    public Integer getFontStyle() {
        Integer num = this.f69407v;
        if (num != null) {
            return num;
        }
        return 0;
    }

    @NonNull
    public Integer getHeight(@NonNull Context context) {
        Float f10 = this.f69406u;
        return Integer.valueOf(f10 != null ? (f10.floatValue() == -1.0f || this.f69406u.floatValue() == -2.0f) ? this.f69406u.intValue() : Utils.dpToPx(context, this.f69406u.floatValue()) : -2);
    }

    @Nullable
    public Float getHideAfter() {
        return this.f69394i;
    }

    @NonNull
    public Integer getHorizontalPosition() {
        Integer num = this.f69390e;
        if (num != null) {
            return num;
        }
        return 3;
    }

    @NonNull
    public Integer getMarginBottom(@NonNull Context context) {
        return Integer.valueOf(this.f69402q != null ? Utils.dpToPx(context, r0.intValue()) : 0);
    }

    @NonNull
    public Integer getMarginLeft(@NonNull Context context) {
        return Integer.valueOf(this.f69399n != null ? Utils.dpToPx(context, r0.intValue()) : 0);
    }

    @NonNull
    public Integer getMarginRight(@NonNull Context context) {
        return Integer.valueOf(this.f69401p != null ? Utils.dpToPx(context, r0.intValue()) : 0);
    }

    @NonNull
    public Integer getMarginTop(@NonNull Context context) {
        return Integer.valueOf(this.f69400o != null ? Utils.dpToPx(context, r0.intValue()) : 0);
    }

    @NonNull
    public Float getOpacity() {
        Float f10 = this.f69393h;
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    @NonNull
    public Integer getPaddingBottom(@NonNull Context context) {
        return Integer.valueOf(this.f69398m != null ? Utils.dpToPx(context, r0.intValue()) : 0);
    }

    @NonNull
    public Integer getPaddingLeft(@NonNull Context context) {
        return Integer.valueOf(this.f69395j != null ? Utils.dpToPx(context, r0.intValue()) : 0);
    }

    @NonNull
    public Integer getPaddingRight(@NonNull Context context) {
        return Integer.valueOf(this.f69396k != null ? Utils.dpToPx(context, r0.intValue()) : 0);
    }

    @NonNull
    public Integer getPaddingTop(@NonNull Context context) {
        return Integer.valueOf(this.f69397l != null ? Utils.dpToPx(context, r0.intValue()) : 0);
    }

    @NonNull
    public Integer getStrokeColor() {
        Integer num = this.f69386a;
        return num != null ? num : Integer.valueOf(Assets.MAIN_ASSETS_COLOR);
    }

    @NonNull
    public Float getStrokeWidth(@NonNull Context context) {
        return Float.valueOf(this.f69404s != null ? Utils.dpToPx(context, r0.floatValue()) : 0.0f);
    }

    @Nullable
    public String getStyle() {
        return this.f69392g;
    }

    @NonNull
    public Integer getVerticalPosition() {
        Integer num = this.f69391f;
        if (num != null) {
            return num;
        }
        return 48;
    }

    @NonNull
    public Integer getWidth(@NonNull Context context) {
        Float f10 = this.f69405t;
        return Integer.valueOf(f10 != null ? (f10.floatValue() == -1.0f || this.f69405t.floatValue() == -2.0f) ? this.f69405t.intValue() : Utils.dpToPx(context, this.f69405t.floatValue()) : -2);
    }

    public boolean hasFillColor() {
        return this.f69387b != null;
    }

    public boolean hasStrokeColor() {
        return this.f69386a != null;
    }

    @NonNull
    public Boolean isOutlined() {
        Boolean bool = this.f69388c;
        return bool != null ? bool : Boolean.FALSE;
    }

    @NonNull
    public Boolean isVisible() {
        Boolean bool = this.f69389d;
        return bool != null ? bool : Boolean.TRUE;
    }

    public void merge(@Nullable IabElementStyle iabElementStyle) {
        if (iabElementStyle == null) {
            return;
        }
        Integer num = iabElementStyle.f69386a;
        if (num != null) {
            this.f69386a = num;
        }
        Integer num2 = iabElementStyle.f69387b;
        if (num2 != null) {
            this.f69387b = num2;
        }
        Boolean bool = iabElementStyle.f69388c;
        if (bool != null) {
            this.f69388c = bool;
        }
        Boolean bool2 = iabElementStyle.f69389d;
        if (bool2 != null) {
            this.f69389d = bool2;
        }
        Integer num3 = iabElementStyle.f69390e;
        if (num3 != null) {
            this.f69390e = num3;
        }
        Integer num4 = iabElementStyle.f69391f;
        if (num4 != null) {
            this.f69391f = num4;
        }
        String str = iabElementStyle.f69392g;
        if (str != null) {
            this.f69392g = str;
        }
        Float f10 = iabElementStyle.f69393h;
        if (f10 != null) {
            this.f69393h = f10;
        }
        Float f11 = iabElementStyle.f69394i;
        if (f11 != null) {
            this.f69394i = f11;
        }
        Integer num5 = iabElementStyle.f69395j;
        if (num5 != null) {
            this.f69395j = num5;
        }
        Integer num6 = iabElementStyle.f69396k;
        if (num6 != null) {
            this.f69396k = num6;
        }
        Integer num7 = iabElementStyle.f69397l;
        if (num7 != null) {
            this.f69397l = num7;
        }
        Integer num8 = iabElementStyle.f69398m;
        if (num8 != null) {
            this.f69398m = num8;
        }
        Integer num9 = iabElementStyle.f69399n;
        if (num9 != null) {
            this.f69399n = num9;
        }
        Integer num10 = iabElementStyle.f69401p;
        if (num10 != null) {
            this.f69401p = num10;
        }
        Integer num11 = iabElementStyle.f69400o;
        if (num11 != null) {
            this.f69400o = num11;
        }
        Integer num12 = iabElementStyle.f69402q;
        if (num12 != null) {
            this.f69402q = num12;
        }
        String str2 = iabElementStyle.f69403r;
        if (str2 != null) {
            this.f69403r = str2;
        }
        Float f12 = iabElementStyle.f69404s;
        if (f12 != null) {
            this.f69404s = f12;
        }
        Float f13 = iabElementStyle.f69405t;
        if (f13 != null) {
            this.f69405t = f13;
        }
        Float f14 = iabElementStyle.f69406u;
        if (f14 != null) {
            this.f69406u = f14;
        }
        Integer num13 = iabElementStyle.f69407v;
        if (num13 != null) {
            this.f69407v = num13;
        }
        Float f15 = iabElementStyle.f69408w;
        if (f15 != null) {
            this.f69408w = f15;
        }
    }

    public int positionAsGravity() {
        return getVerticalPosition().intValue() | getHorizontalPosition().intValue();
    }

    public void setContent(@Nullable String str) {
        this.f69403r = str;
    }

    public void setFillColor(@Nullable Integer num) {
        this.f69387b = num;
    }

    public void setFontSize(@Nullable Float f10) {
        this.f69408w = f10;
    }

    public void setFontStyle(@Nullable Integer num) {
        this.f69407v = num;
    }

    public void setHeight(@Nullable Number number) {
        this.f69406u = number != null ? Float.valueOf(number.floatValue()) : null;
    }

    public void setHideAfter(@Nullable Float f10) {
        this.f69394i = f10;
    }

    public void setHorizontalPosition(@Nullable Integer num) {
        this.f69390e = num;
    }

    public void setMargin(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.f69399n = num;
        this.f69400o = num2;
        this.f69401p = num3;
        this.f69402q = num4;
    }

    public void setMargin(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            setMargin(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(Z7.f30794r);
        if (strArrSplit.length == 1) {
            int iIntValue = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
            setMargin(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
            int iIntValue3 = Utils.convertCssSizeToPx(strArrSplit[1]).intValue();
            setMargin(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
                int iIntValue5 = Utils.convertCssSizeToPx(strArrSplit[1]).intValue();
                setMargin(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                setMargin(Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[3]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[0]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[1]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[2]).intValue()));
            }
        }
    }

    public void setMarginBottom(@Nullable Integer num) {
        this.f69402q = num;
    }

    public void setMarginLeft(@Nullable Integer num) {
        this.f69399n = num;
    }

    public void setMarginRight(@Nullable Integer num) {
        this.f69401p = num;
    }

    public void setMarginTop(@Nullable Integer num) {
        this.f69400o = num;
    }

    public void setOpacity(@Nullable Float f10) {
        this.f69393h = f10;
    }

    public void setOutlined(@Nullable Boolean bool) {
        this.f69388c = bool;
    }

    public void setPadding(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.f69395j = num;
        this.f69397l = num2;
        this.f69396k = num3;
        this.f69398m = num4;
    }

    public void setPadding(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            setPadding(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(Z7.f30794r);
        if (strArrSplit.length == 1) {
            int iIntValue = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
            setPadding(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
            int iIntValue3 = Utils.convertCssSizeToPx(strArrSplit[1]).intValue();
            setPadding(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = Utils.convertCssSizeToPx(strArrSplit[0]).intValue();
                int iIntValue5 = Utils.convertCssSizeToPx(strArrSplit[1]).intValue();
                setPadding(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                setPadding(Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[3]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[0]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[1]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(strArrSplit[2]).intValue()));
            }
        }
    }

    public void setPaddingBottom(@Nullable Integer num) {
        this.f69398m = num;
    }

    public void setPaddingLeft(@Nullable Integer num) {
        this.f69395j = num;
    }

    public void setPaddingRight(@Nullable Integer num) {
        this.f69396k = num;
    }

    public void setPaddingTop(@Nullable Integer num) {
        this.f69397l = num;
    }

    public void setStrokeColor(@Nullable Integer num) {
        this.f69386a = num;
    }

    public void setStrokeWidth(@Nullable Float f10) {
        this.f69404s = f10;
    }

    public void setStyle(@Nullable String str) {
        this.f69392g = str;
    }

    public void setVerticalPosition(@Nullable Integer num) {
        this.f69391f = num;
    }

    public void setVisible(@Nullable Boolean bool) {
        this.f69389d = bool;
    }

    public void setWidth(@Nullable Number number) {
        this.f69405t = number != null ? Float.valueOf(number.floatValue()) : null;
    }
}
