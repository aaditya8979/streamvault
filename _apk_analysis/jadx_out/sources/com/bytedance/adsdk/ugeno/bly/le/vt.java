package com.bytedance.adsdk.ugeno.bly.le;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.ra.ra;
import com.bytedance.adsdk.ugeno.vt.lh;
import com.safedk.android.analytics.reporters.b;

/* JADX INFO: loaded from: classes2.dex */
public class vt extends lh<ouw> {
    private float ajl;
    private TextUtils.TruncateAt baa;
    private int byv;
    private int ehk;
    private int eot;

    /* JADX INFO: renamed from: fg, reason: collision with root package name */
    @Deprecated
    private TextUtils.TruncateAt f11599fg;

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    private int f11600fn;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f11601ki;

    /* JADX INFO: renamed from: kq, reason: collision with root package name */
    private float f11602kq;

    @Deprecated
    private float lai;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    public int f11603ln;
    private boolean mu;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    private float f11604nn;
    public String ouw;
    private float qni;

    /* JADX INFO: renamed from: sm, reason: collision with root package name */
    private float f11605sm;
    private float smu;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private float f11606vf;

    @Deprecated
    private float xne;
    private int xwt;
    private float zjq;

    public vt(Context context) {
        super(context);
        this.f11603ln = ViewCompat.MEASURED_STATE_MASK;
        this.qni = 12.0f;
        this.smu = -1.0f;
        this.byv = Integer.MAX_VALUE;
        this.f11601ki = GravityCompat.START;
        this.baa = TextUtils.TruncateAt.END;
        this.f11604nn = -1.0f;
        this.zjq = 400.0f;
    }

    private void ouw(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((ouw) this.fkw).setEllipsize(truncateAt);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        ouw ouwVar = new ouw(this.vt);
        ouwVar.ouw = this;
        return ouwVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public void ouw(String str, String str2) {
        byte b10;
        byte b11;
        int i10;
        int i11;
        if (TextUtils.isEmpty(str)) {
        }
        super.ouw(str, str2);
        str.hashCode();
        int i12 = 2;
        switch (str.hashCode()) {
            case -1621067310:
                b10 = !str.equals("shadowRadius") ? (byte) -1 : (byte) 0;
                break;
            case -1589741021:
                b10 = !str.equals("shadowColor") ? (byte) -1 : (byte) 1;
                break;
            case -1230714651:
                b10 = !str.equals("shadowOffsetX") ? (byte) -1 : (byte) 2;
                break;
            case -1230714650:
                b10 = !str.equals("shadowOffsetY") ? (byte) -1 : (byte) 3;
                break;
            case -1065511464:
                b10 = !str.equals("textAlign") ? (byte) -1 : (byte) 4;
                break;
            case -1063571914:
                b10 = !str.equals("textColor") ? (byte) -1 : (byte) 5;
                break;
            case -1048634236:
                b10 = !str.equals("textStyle") ? (byte) -1 : (byte) 6;
                break;
            case -1021145689:
                b10 = !str.equals("shadowBlur") ? (byte) -1 : (byte) 7;
                break;
            case -1003668786:
                b10 = !str.equals("textSize") ? (byte) -1 : (byte) 8;
                break;
            case -879295043:
                b10 = !str.equals("textDecoration") ? (byte) -1 : (byte) 9;
                break;
            case -756368940:
                b10 = !str.equals("shadowDx") ? (byte) -1 : (byte) 10;
                break;
            case -756368939:
                b10 = !str.equals("shadowDy") ? (byte) -1 : (byte) 11;
                break;
            case -734428249:
                b10 = !str.equals("fontWeight") ? (byte) -1 : (byte) 12;
                break;
            case -515807685:
                b10 = !str.equals("lineHeight") ? (byte) -1 : (byte) 13;
                break;
            case 3556653:
                b10 = !str.equals("text") ? (byte) -1 : (byte) 14;
                break;
            case 102977279:
                b10 = !str.equals(b.f52847d) ? (byte) -1 : (byte) 15;
                break;
            case 188702929:
                b10 = !str.equals("ellipsis") ? (byte) -1 : (byte) 16;
                break;
            case 351195968:
                b10 = !str.equals("minTextSize") ? (byte) -1 : (byte) 17;
                break;
            case 390232059:
                b10 = !str.equals("maxLines") ? (byte) -1 : (byte) 18;
                break;
            case 1554823821:
                b10 = !str.equals("ellipsize") ? (byte) -1 : (byte) 19;
                break;
            case 2111078717:
                b10 = !str.equals("letterSpacing") ? (byte) -1 : (byte) 20;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 7:
                this.f11606vf = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 1:
                this.eot = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ViewCompat.MEASURED_STATE_MASK);
                this.mu = true;
                break;
            case 2:
                this.ajl = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                break;
            case 3:
                this.f11605sm = ra.ouw(this.vt, com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f));
                break;
            case 4:
                str2.hashCode();
                switch (str2.hashCode()) {
                    case -1364013995:
                        b11 = !str2.equals("center") ? (byte) -1 : (byte) 0;
                        break;
                    case -348726240:
                        b11 = !str2.equals("center_vertical") ? (byte) -1 : (byte) 1;
                        break;
                    case 3317767:
                        b11 = !str2.equals("left") ? (byte) -1 : (byte) 2;
                        break;
                    case 108511772:
                        b11 = !str2.equals("right") ? (byte) -1 : (byte) 3;
                        break;
                    case 1063616078:
                        b11 = !str2.equals("center_horizontal") ? (byte) -1 : (byte) 4;
                        break;
                    default:
                        b11 = -1;
                        break;
                }
                switch (b11) {
                    case 0:
                        i10 = 17;
                        break;
                    case 1:
                        i10 = 16;
                        break;
                    case 2:
                    default:
                        i10 = 3;
                        break;
                    case 3:
                        i10 = 5;
                        break;
                    case 4:
                        i10 = 1;
                        break;
                }
                this.f11601ki = i10;
                break;
            case 5:
                this.f11603ln = com.bytedance.adsdk.ugeno.ra.ouw.ouw(str2, ViewCompat.MEASURED_STATE_MASK);
                break;
            case 6:
                int iHashCode = str2.hashCode();
                if (iHashCode != -1178781136) {
                    if (iHashCode != -1039745817) {
                        if (iHashCode == 3029637 && str2.equals("bold")) {
                        }
                    } else if (str2.equals("normal")) {
                    }
                } else if (str2.equals("italic")) {
                }
                if (r10 == 0) {
                    i12 = 1;
                } else if (r10 != 1) {
                    i12 = 0;
                }
                this.f11600fn = i12;
                break;
            case 8:
                this.qni = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 9:
                str2.hashCode();
                switch (str2) {
                    case "underline":
                        i11 = 8;
                        break;
                    case "strikethrough":
                        i11 = 16;
                        break;
                    case "none":
                    default:
                        i11 = Integer.MAX_VALUE;
                        break;
                }
                this.xwt = i11;
                break;
            case 10:
                this.xne = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 11:
                this.lai = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0.0f);
                break;
            case 12:
                float fOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, -1.0f);
                this.zjq = fOuw;
                if (fOuw < 1.0f || fOuw > 1000.0f) {
                    this.zjq = 400.0f;
                }
                break;
            case 13:
                this.f11604nn = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 1.0f);
                break;
            case 14:
                this.ouw = str2;
                break;
            case 15:
                this.ehk = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, 0);
                break;
            case 16:
                this.baa = TextUtils.equals(str2, "none") ? null : TextUtils.TruncateAt.END;
                break;
            case 17:
                this.smu = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, -1.0f);
                break;
            case 18:
                int iOuw = com.bytedance.adsdk.ugeno.ra.lh.ouw(str2, Integer.MAX_VALUE);
                this.byv = iOuw > 0 ? iOuw : Integer.MAX_VALUE;
                break;
            case 19:
                str2.hashCode();
                switch (str2.hashCode()) {
                    case -1364013995:
                        if (str2.equals("center")) {
                        }
                        break;
                    case 100571:
                        if (str2.equals("end")) {
                        }
                        break;
                    case 109757538:
                        if (str2.equals("start")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:88)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:88)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    Method dump skipped, instruction units count: 966
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.bly.le.vt.ouw(java.lang.String, java.lang.String):void");
            }

            public void ryl(String str) {
                this.ouw = str;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (TextUtils.equals("null", str)) {
                    this.ouw = "";
                }
                ((ouw) this.fkw).setText(this.ouw);
            }

            @Override // com.bytedance.adsdk.ugeno.vt.lh
            public void vt() {
                super.vt();
                if (TextUtils.equals("null", this.ouw)) {
                    this.ouw = "";
                }
                ryl(this.ouw);
                ((ouw) this.fkw).setTextSize(1, this.qni);
                ((ouw) this.fkw).setTextColor(this.f11603ln);
                ((ouw) this.fkw).setLines(this.ehk);
                ((ouw) this.fkw).setMaxLines(this.byv);
                ((ouw) this.fkw).setGravity(this.f11601ki);
                ((ouw) this.fkw).setIncludeFontPadding(false);
                ((ouw) this.fkw).setMinTextSize(ra.ouw(this.vt, this.smu));
                int i10 = this.xwt;
                this.xwt = i10;
                if (i10 != Integer.MAX_VALUE) {
                    ((ouw) this.fkw).setPaintFlags(i10);
                }
                if (ex()) {
                    ouw(this.baa);
                } else {
                    ouw(this.f11599fg);
                }
                if (this.f11604nn > 0.0f) {
                    if (ex()) {
                        float f10 = this.f11604nn;
                        if (f10 <= 3.0f) {
                            ((ouw) this.fkw).setLineSpacing(0.0f, f10);
                        } else if (Build.VERSION.SDK_INT >= 28) {
                            int iRound = Math.round(ra.ouw(this.vt, (f10 - (this.qni * 1.2f)) / 2.0f));
                            int paddingTop = ((ouw) this.fkw).getPaddingTop() + iRound;
                            int paddingBottom = ((ouw) this.fkw).getPaddingBottom() + iRound;
                            T t10 = this.fkw;
                            ((ouw) t10).setPadding(((ouw) t10).getPaddingLeft(), paddingTop, ((ouw) this.fkw).getPaddingRight(), paddingBottom);
                            ((ouw) this.fkw).setLineHeight(Math.round(ra.ouw(this.vt, this.f11604nn)));
                        }
                    } else {
                        ((ouw) this.fkw).setLineSpacing(0.0f, this.f11604nn);
                    }
                }
                int i11 = Build.VERSION.SDK_INT;
                ((ouw) this.fkw).setBreakStrategy(0);
                if (!ex()) {
                    ((ouw) this.fkw).setShadowLayer(this.f11606vf, this.xne, this.lai, this.eot);
                } else if (this.mu) {
                    if (this.f11606vf <= 0.0f) {
                        this.f11606vf = 1.0E-5f;
                    }
                    ((ouw) this.fkw).setShadowLayer(this.f11606vf, this.ajl, this.f11605sm, this.eot);
                }
                int i12 = this.f11600fn;
                if (i12 == 1) {
                    ((ouw) this.fkw).setTypeface(Typeface.DEFAULT, i12);
                } else if (i11 >= 28) {
                    ((ouw) this.fkw).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.zjq, i12 == 2));
                } else if (this.zjq >= 500.0f) {
                    ((ouw) this.fkw).setTypeface(Typeface.DEFAULT, 1);
                }
                if (ra.ouw(this.vt, this.qni) > 0.0f) {
                    ((ouw) this.fkw).setLetterSpacing(this.f11602kq / ra.ouw(this.vt, this.qni));
                }
            }
        }
