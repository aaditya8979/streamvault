package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bo.d0;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.protobuf.EventTypeExtended;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p000do.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bn.g f49497a = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.x
        @Override // sn.a
        public final Object invoke() {
            return k.w();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NumberFormat f49498b = NumberFormat.getPercentInstance();

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseInLineTag")
    public static final class A extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f49502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f49503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f49504f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f49505g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f49506h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49507i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f49508j;

        public A(hn.c<? super A> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49507i = obj;
            this.f49508j |= Integer.MIN_VALUE;
            return k.k(null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseLinearTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {124, 125, 126, 127, 128, 129}, m = "invokeSuspend")
    public static final class B extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49512d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49514f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49515g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ List f49516h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List f49517i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49518j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ boolean f49519k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List f49520l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, List list, List list2, Ref$ObjectRef ref$ObjectRef4, boolean z10, List list3) {
            super(2, cVar);
            this.f49512d = xmlPullParser;
            this.f49513e = ref$ObjectRef;
            this.f49514f = ref$ObjectRef2;
            this.f49515g = ref$ObjectRef3;
            this.f49516h = list;
            this.f49517i = list2;
            this.f49518j = ref$ObjectRef4;
            this.f49519k = z10;
            this.f49520l = list3;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((B) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            B b10 = new B(this.f49512d, cVar, this.f49513e, this.f49514f, this.f49515g, this.f49516h, this.f49517i, this.f49518j, this.f49519k, this.f49520l);
            b10.f49511c = obj;
            return b10;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:105:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0189  */
        /* JADX WARN: Type inference failed for: r2v34, types: [T, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t] */
        /* JADX WARN: Type inference failed for: r2v38, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v42, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v20, types: [T, java.lang.Long] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x01f3 -> B:104:0x01f8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00af -> B:104:0x01f8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b9 -> B:104:0x01f8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c1 -> B:104:0x01f8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c7 -> B:104:0x01f8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d2 -> B:104:0x01f8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00f8 -> B:104:0x01f8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x010c -> B:51:0x0111). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x011d -> B:104:0x01f8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0142 -> B:104:0x01f8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0167 -> B:104:0x01f8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0193 -> B:104:0x01f8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x01b8 -> B:104:0x01f8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01da -> B:104:0x01f8). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 566
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.B.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseLinearTag")
    public static final class C extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f49521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f49524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f49525e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f49526f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f49527g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f49528h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49529i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f49530j;

        public C(hn.c<? super C> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49529i = obj;
            this.f49530j |= Integer.MIN_VALUE;
            return k.e0(null, false, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseMediaFileTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    public static final class D extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49536f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49537g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49538h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49539i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49540j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49541k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49542l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49543m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49544n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49545o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49546p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Ref$ObjectRef ref$ObjectRef6, Ref$ObjectRef ref$ObjectRef7, Ref$ObjectRef ref$ObjectRef8, Ref$ObjectRef ref$ObjectRef9, Ref$ObjectRef ref$ObjectRef10, Ref$ObjectRef ref$ObjectRef11, Ref$ObjectRef ref$ObjectRef12) {
            super(2, cVar);
            this.f49534d = xmlPullParser;
            this.f49535e = ref$ObjectRef;
            this.f49536f = ref$ObjectRef2;
            this.f49537g = ref$ObjectRef3;
            this.f49538h = ref$ObjectRef4;
            this.f49539i = ref$ObjectRef5;
            this.f49540j = ref$ObjectRef6;
            this.f49541k = ref$ObjectRef7;
            this.f49542l = ref$ObjectRef8;
            this.f49543m = ref$ObjectRef9;
            this.f49544n = ref$ObjectRef10;
            this.f49545o = ref$ObjectRef11;
            this.f49546p = ref$ObjectRef12;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((D) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            D d10 = new D(this.f49534d, cVar, this.f49535e, this.f49536f, this.f49537g, this.f49538h, this.f49539i, this.f49540j, this.f49541k, this.f49542l, this.f49543m, this.f49544n, this.f49545o, this.f49546p);
            d10.f49533c = obj;
            return d10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v17, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Boolean] */
        /* JADX WARN: Type inference failed for: r2v7, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            in.a.g();
            if (this.f49532b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            kotlinx.coroutines.d.g((l0) this.f49533c);
            if (k.n0(this.f49534d)) {
                this.f49534d.nextTag();
            }
            if (k.i0(this.f49534d)) {
                return bn.r.f5635a;
            }
            if (!k.p0(this.f49534d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f49534d.getDepth();
            while (this.f49534d.getDepth() >= depth) {
                int depth2 = this.f49534d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.p0(this.f49534d);
                    }
                } else if (k.p0(this.f49534d)) {
                    XmlPullParser xmlPullParser = this.f49534d;
                    this.f49535e.element = k.G(xmlPullParser, "id");
                    this.f49536f.element = jn.a.a(tn.p.f(k.G(xmlPullParser, "delivery"), "progressive"));
                    this.f49537g.element = k.G(xmlPullParser, "type");
                    Ref$ObjectRef ref$ObjectRef = this.f49538h;
                    String strG = k.G(xmlPullParser, "width");
                    ref$ObjectRef.element = strG != null ? bo.z.r(strG) : 0;
                    Ref$ObjectRef ref$ObjectRef2 = this.f49539i;
                    String strG2 = k.G(xmlPullParser, "height");
                    ref$ObjectRef2.element = strG2 != null ? bo.z.r(strG2) : 0;
                    this.f49540j.element = k.G(xmlPullParser, VastAttributes.CODEC);
                    Ref$ObjectRef ref$ObjectRef3 = this.f49541k;
                    String strG3 = k.G(xmlPullParser, VastAttributes.BITRATE);
                    ref$ObjectRef3.element = strG3 != null ? bo.z.r(strG3) : 0;
                    Ref$ObjectRef ref$ObjectRef4 = this.f49542l;
                    String strG4 = k.G(xmlPullParser, VastAttributes.MIN_BITRATE);
                    ref$ObjectRef4.element = strG4 != null ? bo.z.r(strG4) : 0;
                    Ref$ObjectRef ref$ObjectRef5 = this.f49543m;
                    String strG5 = k.G(xmlPullParser, VastAttributes.MAX_BITRATE);
                    ref$ObjectRef5.element = strG5 != null ? bo.z.r(strG5) : 0;
                    Ref$ObjectRef ref$ObjectRef6 = this.f49544n;
                    String strG6 = k.G(xmlPullParser, VastAttributes.SCALABLE);
                    ref$ObjectRef6.element = strG6 != null ? jn.a.a(Boolean.parseBoolean(strG6)) : 0;
                    this.f49545o.element = k.G(xmlPullParser, VastAttributes.API_FRAMEWORK);
                } else if (k.r0(this.f49534d) && (text = this.f49534d.getText()) != null && !d0.u0(text)) {
                    String text2 = this.f49534d.getText();
                    tn.p.j(text2, "getText(...)");
                    this.f49546p.element = d0.s1(text2).toString();
                } else if (k.l0(this.f49534d)) {
                    return bn.r.f5635a;
                }
                this.f49534d.next();
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseMediaFileTag")
    public static final class E extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f49550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f49551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f49552f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f49553g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f49554h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Object f49555i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f49556j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f49557k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Object f49558l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f49559m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f49560n;

        public E(hn.c<? super E> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49559m = obj;
            this.f49560n |= Integer.MIN_VALUE;
            return k.l(null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseMediaFilesTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123}, m = "invokeSuspend")
    public static final class F extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List f49565e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(XmlPullParser xmlPullParser, hn.c cVar, List list) {
            super(2, cVar);
            this.f49564d = xmlPullParser;
            this.f49565e = list;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((F) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            F f10 = new F(this.f49564d, cVar, this.f49565e);
            f10.f49563c = obj;
            return f10;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006a -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0078 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0085 -> B:32:0x008a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x009d -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00b7 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d0 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 231
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.F.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseMediaFilesTag")
    public static final class G extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f49567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f49568c;

        public G(hn.c<? super G> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49567b = obj;
            this.f49568c |= Integer.MIN_VALUE;
            return k.m(null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parsePricingTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    public static final class H extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49574f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, cVar);
            this.f49572d = xmlPullParser;
            this.f49573e = ref$ObjectRef;
            this.f49574f = ref$ObjectRef2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((H) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            H h10 = new H(this.f49572d, cVar, this.f49573e, this.f49574f);
            h10.f49571c = obj;
            return h10;
        }

        /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            in.a.g();
            if (this.f49570b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            kotlinx.coroutines.d.g((l0) this.f49571c);
            if (k.n0(this.f49572d)) {
                this.f49572d.nextTag();
            }
            if (k.i0(this.f49572d)) {
                return bn.r.f5635a;
            }
            if (!k.p0(this.f49572d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f49572d.getDepth();
            while (this.f49572d.getDepth() >= depth) {
                int depth2 = this.f49572d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.p0(this.f49572d);
                    }
                } else if (k.p0(this.f49572d)) {
                    XmlPullParser xmlPullParser = this.f49572d;
                    this.f49573e.element = k.G(xmlPullParser, "model");
                    this.f49574f.element = k.G(xmlPullParser, "currency");
                } else if (k.r0(this.f49572d) && (text = this.f49572d.getText()) != null && !d0.u0(text)) {
                    String text2 = this.f49572d.getText();
                    tn.p.j(text2, "getText(...)");
                    d0.s1(text2).toString();
                } else if (k.l0(this.f49572d)) {
                    return bn.r.f5635a;
                }
                this.f49572d.next();
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parsePricingTag")
    public static final class I extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f49578d;

        public I(hn.c<? super I> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49577c = obj;
            this.f49578d |= Integer.MIN_VALUE;
            return k.n(null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseStaticResourceTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    public static final class J extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49584f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, cVar);
            this.f49582d = xmlPullParser;
            this.f49583e = ref$ObjectRef;
            this.f49584f = ref$ObjectRef2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((J) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            J j10 = new J(this.f49582d, cVar, this.f49583e, this.f49584f);
            j10.f49581c = obj;
            return j10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            in.a.g();
            if (this.f49580b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            kotlinx.coroutines.d.g((l0) this.f49581c);
            if (k.n0(this.f49582d)) {
                this.f49582d.nextTag();
            }
            if (k.i0(this.f49582d)) {
                return bn.r.f5635a;
            }
            if (!k.p0(this.f49582d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f49582d.getDepth();
            while (this.f49582d.getDepth() >= depth) {
                int depth2 = this.f49582d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.p0(this.f49582d);
                    }
                } else if (k.p0(this.f49582d)) {
                    XmlPullParser xmlPullParser = this.f49582d;
                    Ref$ObjectRef ref$ObjectRef = this.f49583e;
                    String strG = k.G(xmlPullParser, "creativeType");
                    ref$ObjectRef.element = strG != null ? k.R(strG) : 0;
                } else if (k.r0(this.f49582d) && (text = this.f49582d.getText()) != null && !d0.u0(text)) {
                    String text2 = this.f49582d.getText();
                    tn.p.j(text2, "getText(...)");
                    this.f49584f.element = d0.s1(text2).toString();
                } else if (k.l0(this.f49582d)) {
                    return bn.r.f5635a;
                }
                this.f49582d.next();
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseStaticResourceTag")
    public static final class K extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f49588d;

        public K(hn.c<? super K> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49587c = obj;
            this.f49588d |= Integer.MIN_VALUE;
            return k.o(null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseTagsTextOnly$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    public static final class L extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49592d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49593e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef) {
            super(2, cVar);
            this.f49592d = xmlPullParser;
            this.f49593e = ref$ObjectRef;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((L) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            L l10 = new L(this.f49592d, cVar, this.f49593e);
            l10.f49591c = obj;
            return l10;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            in.a.g();
            if (this.f49590b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            kotlinx.coroutines.d.g((l0) this.f49591c);
            if (k.n0(this.f49592d)) {
                this.f49592d.nextTag();
            }
            if (k.i0(this.f49592d)) {
                return bn.r.f5635a;
            }
            if (!k.p0(this.f49592d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f49592d.getDepth();
            while (this.f49592d.getDepth() >= depth) {
                int depth2 = this.f49592d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.p0(this.f49592d);
                    }
                } else if (k.p0(this.f49592d)) {
                    continue;
                } else if (k.r0(this.f49592d) && (text = this.f49592d.getText()) != null && !d0.u0(text)) {
                    String text2 = this.f49592d.getText();
                    tn.p.j(text2, "getText(...)");
                    this.f49593e.element = d0.s1(text2).toString();
                } else if (k.l0(this.f49592d)) {
                    return bn.r.f5635a;
                }
                this.f49592d.next();
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseTagsTextOnly")
    public static final class M extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f49595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f49596c;

        public M(hn.c<? super M> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49595b = obj;
            this.f49596c |= Integer.MIN_VALUE;
            return k.p(null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseTrackingEventsTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123}, m = "invokeSuspend")
    public static final class N extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49600d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List f49601e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public N(XmlPullParser xmlPullParser, hn.c cVar, List list) {
            super(2, cVar);
            this.f49600d = xmlPullParser;
            this.f49601e = list;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((N) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            N n10 = new N(this.f49600d, cVar, this.f49601e);
            n10.f49599c = obj;
            return n10;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006a -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0078 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0085 -> B:32:0x008a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x009d -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00b7 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d0 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 231
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseTrackingEventsTag")
    public static final class O extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f49603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f49604c;

        public O(hn.c<? super O> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49603b = obj;
            this.f49604c |= Integer.MIN_VALUE;
            return k.q(null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseTrackingTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    public static final class P extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49611g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public P(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
            super(2, cVar);
            this.f49608d = xmlPullParser;
            this.f49609e = ref$ObjectRef;
            this.f49610f = ref$ObjectRef2;
            this.f49611g = ref$ObjectRef3;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((P) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            P p10 = new P(this.f49608d, cVar, this.f49609e, this.f49610f, this.f49611g);
            p10.f49607c = obj;
            return p10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            in.a.g();
            if (this.f49606b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            kotlinx.coroutines.d.g((l0) this.f49607c);
            if (k.n0(this.f49608d)) {
                this.f49608d.nextTag();
            }
            if (k.i0(this.f49608d)) {
                return bn.r.f5635a;
            }
            if (!k.p0(this.f49608d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f49608d.getDepth();
            while (this.f49608d.getDepth() >= depth) {
                int depth2 = this.f49608d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.p0(this.f49608d);
                    }
                } else if (k.p0(this.f49608d)) {
                    XmlPullParser xmlPullParser = this.f49608d;
                    Ref$ObjectRef ref$ObjectRef = this.f49609e;
                    String strG = k.G(xmlPullParser, "event");
                    ref$ObjectRef.element = strG != null ? k.j0(strG) : 0;
                    Ref$ObjectRef ref$ObjectRef2 = this.f49610f;
                    String strG2 = k.G(xmlPullParser, TypedValues.CycleType.S_WAVE_OFFSET);
                    ref$ObjectRef2.element = strG2 != null ? k.b0(strG2) : 0;
                } else if (k.r0(this.f49608d) && (text = this.f49608d.getText()) != null && !d0.u0(text)) {
                    String text2 = this.f49608d.getText();
                    tn.p.j(text2, "getText(...)");
                    this.f49611g.element = d0.s1(text2).toString();
                } else if (k.l0(this.f49608d)) {
                    return bn.r.f5635a;
                }
                this.f49608d.next();
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseTrackingTag")
    public static final class Q extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49614c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f49615d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f49616e;

        public Q(hn.c<? super Q> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49615d = obj;
            this.f49616e |= Integer.MIN_VALUE;
            return k.r(null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVast$2", f = "VastParser.kt", l = {130}, m = "invokeSuspend")
    public static final class R extends SuspendLambda implements sn.p<l0, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49618b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public R(XmlPullParser xmlPullParser, hn.c<? super R> cVar) {
            super(2, cVar);
            this.f49618b = xmlPullParser;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z> cVar) {
            return ((R) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new R(this.f49618b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f49617a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                XmlPullParser xmlPullParser = this.f49618b;
                this.f49617a = 1;
                obj = k.t(xmlPullParser, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return obj;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVastTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {124, 125}, m = "invokeSuspend")
    public static final class S extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49621c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49622d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49624f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List f49625g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public S(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, List list) {
            super(2, cVar);
            this.f49622d = xmlPullParser;
            this.f49623e = ref$ObjectRef;
            this.f49624f = ref$ObjectRef2;
            this.f49625g = list;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((S) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            S s10 = new S(this.f49622d, cVar, this.f49623e, this.f49624f, this.f49625g);
            s10.f49621c = obj;
            return s10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARN: Type inference failed for: r4v18, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v24, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0072 -> B:60:0x0117). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007c -> B:60:0x0117). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ad -> B:60:0x0117). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00bd -> B:42:0x00c2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d4 -> B:60:0x0117). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00f9 -> B:60:0x0117). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0112 -> B:60:0x0117). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 297
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.S.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseVastTag")
    public static final class T extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f49629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f49630e;

        public T(hn.c<? super T> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49629d = obj;
            this.f49630e |= Integer.MIN_VALUE;
            return k.t(null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVideoClickTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    public static final class U extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49634d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49636f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public U(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, cVar);
            this.f49634d = xmlPullParser;
            this.f49635e = ref$ObjectRef;
            this.f49636f = ref$ObjectRef2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((U) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            U u10 = new U(this.f49634d, cVar, this.f49635e, this.f49636f);
            u10.f49633c = obj;
            return u10;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            in.a.g();
            if (this.f49632b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            kotlinx.coroutines.d.g((l0) this.f49633c);
            if (k.n0(this.f49634d)) {
                this.f49634d.nextTag();
            }
            if (k.i0(this.f49634d)) {
                return bn.r.f5635a;
            }
            if (!k.p0(this.f49634d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f49634d.getDepth();
            while (this.f49634d.getDepth() >= depth) {
                int depth2 = this.f49634d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.p0(this.f49634d);
                    }
                } else if (k.p0(this.f49634d)) {
                    this.f49635e.element = k.G(this.f49634d, "id");
                } else if (k.r0(this.f49634d) && (text = this.f49634d.getText()) != null && !d0.u0(text)) {
                    String text2 = this.f49634d.getText();
                    tn.p.j(text2, "getText(...)");
                    this.f49636f.element = d0.s1(text2).toString();
                } else if (k.l0(this.f49634d)) {
                    return bn.r.f5635a;
                }
                this.f49634d.next();
            }
            return bn.r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseVideoClickTag")
    public static final class V extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f49640d;

        public V(hn.c<? super V> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49639c = obj;
            this.f49640d |= Integer.MIN_VALUE;
            return k.u(null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseVideoClicksTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123, 124, 126}, m = "invokeSuspend")
    public static final class W extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49644d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List f49646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List f49647g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public W(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, List list, List list2) {
            super(2, cVar);
            this.f49644d = xmlPullParser;
            this.f49645e = ref$ObjectRef;
            this.f49646f = list;
            this.f49647g = list2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((W) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            W w10 = new W(this.f49644d, cVar, this.f49645e, this.f49646f, this.f49647g);
            w10.f49643c = obj;
            return w10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x015d  */
        /* JADX WARN: Type inference failed for: r5v21, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007f -> B:83:0x0156). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0089 -> B:83:0x0156). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:83:0x0156). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a5 -> B:83:0x0156). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00af -> B:83:0x0156). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00c7 -> B:67:0x0114). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c9 -> B:67:0x0114). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00d5 -> B:83:0x0156). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00e6 -> B:56:0x00eb). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00fb -> B:83:0x0156). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x011e -> B:83:0x0156). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0138 -> B:83:0x0156). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0151 -> B:83:0x0156). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.W.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseVideoClicksTag")
    public static final class X extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f49648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f49651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f49652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f49653f;

        public X(hn.c<? super X> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49652e = obj;
            this.f49653f |= Integer.MIN_VALUE;
            return k.h0(null, false, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseWrapperTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {126, 127, 128, 129, 130}, m = "invokeSuspend")
    public static final class Y extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49659f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49660g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ List f49661h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ List f49662i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List f49663j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Y(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, List list, List list2, List list3) {
            super(2, cVar);
            this.f49657d = xmlPullParser;
            this.f49658e = ref$ObjectRef;
            this.f49659f = ref$ObjectRef2;
            this.f49660g = ref$ObjectRef3;
            this.f49661h = list;
            this.f49662i = list2;
            this.f49663j = list3;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((Y) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            Y y10 = new Y(this.f49657d, cVar, this.f49658e, this.f49659f, this.f49660g, this.f49661h, this.f49662i, this.f49663j);
            y10.f49656c = obj;
            return y10;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x01c7, code lost:
        
            r9.element = null;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:103:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
        /* JADX WARN: Type inference failed for: r7v27, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v29, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v4, types: [T, java.lang.Boolean] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x009f -> B:102:0x01c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a9 -> B:102:0x01c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b1 -> B:102:0x01c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b7 -> B:102:0x01c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c2 -> B:102:0x01c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00da -> B:67:0x0128). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00dc -> B:67:0x0128). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00e8 -> B:102:0x01c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0100 -> B:67:0x0128). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0102 -> B:67:0x0128). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x010e -> B:102:0x01c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0133 -> B:102:0x01c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0154 -> B:102:0x01c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0166 -> B:83:0x016b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01a9 -> B:102:0x01c7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01c2 -> B:102:0x01c7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 496
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseWrapperTag")
    public static final class Z extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f49667d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f49668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f49669f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f49670g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f49671h;

        public Z(hn.c<? super Z> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49670g = obj;
            this.f49671h |= Integer.MIN_VALUE;
            return k.v(null, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$b, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseAdParametersTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    public static final class C4391b extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49677f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4391b(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, cVar);
            this.f49675d = xmlPullParser;
            this.f49676e = ref$ObjectRef;
            this.f49677f = ref$ObjectRef2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C4391b) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            C4391b c4391b = new C4391b(this.f49675d, cVar, this.f49676e, this.f49677f);
            c4391b.f49674c = obj;
            return c4391b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            in.a.g();
            if (this.f49673b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            kotlinx.coroutines.d.g((l0) this.f49674c);
            if (k.n0(this.f49675d)) {
                this.f49675d.nextTag();
            }
            if (k.i0(this.f49675d)) {
                return bn.r.f5635a;
            }
            if (!k.p0(this.f49675d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f49675d.getDepth();
            while (this.f49675d.getDepth() >= depth) {
                int depth2 = this.f49675d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.p0(this.f49675d);
                    }
                } else if (k.p0(this.f49675d)) {
                    XmlPullParser xmlPullParser = this.f49675d;
                    Ref$ObjectRef ref$ObjectRef = this.f49676e;
                    String strG = k.G(xmlPullParser, "xmlEncoded");
                    ref$ObjectRef.element = strG != null ? jn.a.a(Boolean.parseBoolean(strG)) : 0;
                } else if (k.r0(this.f49675d) && (text = this.f49675d.getText()) != null && !d0.u0(text)) {
                    String text2 = this.f49675d.getText();
                    tn.p.j(text2, "getText(...)");
                    this.f49677f.element = d0.s1(text2).toString();
                } else if (k.l0(this.f49675d)) {
                    return bn.r.f5635a;
                }
                this.f49675d.next();
            }
            return bn.r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$c, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseAdParametersTag")
    public static final class C4392c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f49681d;

        public C4392c(hn.c<? super C4392c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49680c = obj;
            this.f49681d |= Integer.MIN_VALUE;
            return k.G0(null, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$d, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseAdSystemTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    public static final class C4393d extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49684c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49685d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49687f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4393d(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, cVar);
            this.f49685d = xmlPullParser;
            this.f49686e = ref$ObjectRef;
            this.f49687f = ref$ObjectRef2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C4393d) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            C4393d c4393d = new C4393d(this.f49685d, cVar, this.f49686e, this.f49687f);
            c4393d.f49684c = obj;
            return c4393d;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            in.a.g();
            if (this.f49683b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            kotlinx.coroutines.d.g((l0) this.f49684c);
            if (k.n0(this.f49685d)) {
                this.f49685d.nextTag();
            }
            if (k.i0(this.f49685d)) {
                return bn.r.f5635a;
            }
            if (!k.p0(this.f49685d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f49685d.getDepth();
            while (this.f49685d.getDepth() >= depth) {
                int depth2 = this.f49685d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.p0(this.f49685d);
                    }
                } else if (k.p0(this.f49685d)) {
                    this.f49686e.element = k.G(this.f49685d, "version");
                } else if (k.r0(this.f49685d) && (text = this.f49685d.getText()) != null && !d0.u0(text)) {
                    String text2 = this.f49685d.getText();
                    tn.p.j(text2, "getText(...)");
                    this.f49687f.element = d0.s1(text2).toString();
                } else if (k.l0(this.f49685d)) {
                    return bn.r.f5635a;
                }
                this.f49685d.next();
            }
            return bn.r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$e, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseAdSystemTag")
    public static final class C4394e extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f49691d;

        public C4394e(hn.c<? super C4394e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49690c = obj;
            this.f49691d |= Integer.MIN_VALUE;
            return k.H0(null, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$f, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseAdTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {126, 127}, m = "invokeSuspend")
    public static final class C4395f extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49697f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49698g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4395f(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
            super(2, cVar);
            this.f49695d = xmlPullParser;
            this.f49696e = ref$ObjectRef;
            this.f49697f = ref$ObjectRef2;
            this.f49698g = ref$ObjectRef3;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C4395f) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            C4395f c4395f = new C4395f(this.f49695d, cVar, this.f49696e, this.f49697f, this.f49698g);
            c4395f.f49694c = obj;
            return c4395f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x013a  */
        /* JADX WARN: Type inference failed for: r5v18, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.String] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0078 -> B:66:0x0133). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0082 -> B:66:0x0133). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:66:0x0133). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ca -> B:45:0x00cf). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00dd -> B:50:0x00de). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00e9 -> B:66:0x0133). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0115 -> B:66:0x0133). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x012e -> B:66:0x0133). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 325
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4395f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$g, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseAdTag")
    public static final class C4396g extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f49702d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f49703e;

        public C4396g(hn.c<? super C4396g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49702d = obj;
            this.f49703e |= Integer.MIN_VALUE;
            return k.a(null, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$h, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCompanionAdsTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123}, m = "invokeSuspend")
    public static final class C4397h extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49707d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List f49708e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4397h(XmlPullParser xmlPullParser, hn.c cVar, List list) {
            super(2, cVar);
            this.f49707d = xmlPullParser;
            this.f49708e = list;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C4397h) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            C4397h c4397h = new C4397h(this.f49707d, cVar, this.f49708e);
            c4397h.f49706c = obj;
            return c4397h;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006a -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0078 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0085 -> B:32:0x008a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x009d -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00b7 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d0 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 231
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4397h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$i, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseCompanionAdsTag")
    public static final class C4398i extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f49710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f49711c;

        public C4398i(hn.c<? super C4398i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49710b = obj;
            this.f49711c |= Integer.MIN_VALUE;
            return k.b(null, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$j, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCompanionTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {128, 130, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 136, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 141, 146, 147}, m = "invokeSuspend")
    public static final class C4399j extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49715d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49716e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49717f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49718g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49719h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49720i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49721j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List f49722k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49723l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List f49724m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List f49725n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4399j(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Ref$ObjectRef ref$ObjectRef6, List list, Ref$ObjectRef ref$ObjectRef7, List list2, List list3) {
            super(2, cVar);
            this.f49715d = xmlPullParser;
            this.f49716e = ref$ObjectRef;
            this.f49717f = ref$ObjectRef2;
            this.f49718g = ref$ObjectRef3;
            this.f49719h = ref$ObjectRef4;
            this.f49720i = ref$ObjectRef5;
            this.f49721j = ref$ObjectRef6;
            this.f49722k = list;
            this.f49723l = ref$ObjectRef7;
            this.f49724m = list2;
            this.f49725n = list3;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C4399j) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            C4399j c4399j = new C4399j(this.f49715d, cVar, this.f49716e, this.f49717f, this.f49718g, this.f49719h, this.f49720i, this.f49721j, this.f49722k, this.f49723l, this.f49724m, this.f49725n);
            c4399j.f49714c = obj;
            return c4399j;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:147:0x02ad, code lost:
        
            r4.element = null;
            r10.f49719h.element = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G(r2, io.bidmachine.iab.vast.tags.VastAttributes.API_FRAMEWORK);
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0207  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x02b4  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01ad  */
        /* JADX WARN: Type inference failed for: r2v37, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v38, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v42, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v46, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v52, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v11, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.String] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x01ec -> B:139:0x02ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0205 -> B:76:0x0178). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0207 -> B:76:0x0178). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x0219 -> B:139:0x02ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:134:0x028f -> B:139:0x02ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x02a8 -> B:139:0x02ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ba -> B:139:0x02ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c4 -> B:139:0x02ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00cc -> B:139:0x02ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d2 -> B:139:0x02ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00dd -> B:139:0x02ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00f6 -> B:76:0x0178). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f8 -> B:76:0x0178). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x010a -> B:139:0x02ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x011d -> B:55:0x0122). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0132 -> B:139:0x02ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0154 -> B:139:0x02ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x016c -> B:76:0x0178). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x016e -> B:76:0x0178). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0183 -> B:139:0x02ad). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01c0 -> B:76:0x0178). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01ca -> B:139:0x02ad). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 760
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4399j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$k, reason: collision with other inner class name */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseCompanionTag")
    public static final class C0657k extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f49729d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f49730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f49731f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f49732g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f49733h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Object f49734i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f49735j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f49736k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f49737l;

        public C0657k(hn.c<? super C0657k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49736k = obj;
            this.f49737l |= Integer.MIN_VALUE;
            return k.c(null, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$l, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCreativeTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {129, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend")
    public static final class C4400l extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49740c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49741d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49742e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49743f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49744g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49745h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49746i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f49747j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4400l(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, boolean z10) {
            super(2, cVar);
            this.f49741d = xmlPullParser;
            this.f49742e = ref$ObjectRef;
            this.f49743f = ref$ObjectRef2;
            this.f49744g = ref$ObjectRef3;
            this.f49745h = ref$ObjectRef4;
            this.f49746i = ref$ObjectRef5;
            this.f49747j = z10;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C4400l) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            C4400l c4400l = new C4400l(this.f49741d, cVar, this.f49742e, this.f49743f, this.f49744g, this.f49745h, this.f49746i, this.f49747j);
            c4400l.f49740c = obj;
            return c4400l;
        }

        /* JADX WARN: Code restructure failed: missing block: B:78:0x00f2, code lost:
        
            r7 = 0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0162  */
        /* JADX WARN: Type inference failed for: r5v19, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r7v6, types: [T, java.lang.String] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0078 -> B:73:0x015b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0082 -> B:73:0x015b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:73:0x015b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b0 -> B:39:0x00b5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d2 -> B:48:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00fd -> B:73:0x015b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x013d -> B:73:0x015b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0156 -> B:73:0x015b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 365
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4400l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$m, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseCreativeTag")
    public static final class C4401m extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f49751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f49752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f49753f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f49754g;

        public C4401m(hn.c<? super C4401m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49753f = obj;
            this.f49754g |= Integer.MIN_VALUE;
            return k.T(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$n, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseCreativesTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123}, m = "invokeSuspend")
    public static final class C4402n extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f49759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List f49760f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4402n(XmlPullParser xmlPullParser, hn.c cVar, boolean z10, List list) {
            super(2, cVar);
            this.f49758d = xmlPullParser;
            this.f49759e = z10;
            this.f49760f = list;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C4402n) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            C4402n c4402n = new C4402n(this.f49758d, cVar, this.f49759e, this.f49760f);
            c4402n.f49757c = obj;
            return c4402n;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:51:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006a -> B:51:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0078 -> B:51:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0087 -> B:32:0x008c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x009f -> B:51:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00b9 -> B:51:0x00d7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d2 -> B:51:0x00d7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4402n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$o, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseCreativesTag")
    public static final class C4403o extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f49762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f49763c;

        public C4403o(hn.c<? super C4403o> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49762b = obj;
            this.f49763c |= Integer.MIN_VALUE;
            return k.Z(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$p, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {799}, m = "parseHtmlResourceTag")
    public static final class C4404p extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f49764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49765b;

        public C4404p(hn.c<? super C4404p> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49764a = obj;
            this.f49765b |= Integer.MIN_VALUE;
            return k.e(null, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$q, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {EventTypeExtended.EVENT_TYPE_EXTENDED_NURL_VALUE}, m = "parseIFrameResourceTag")
    public static final class C4405q extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f49766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49767b;

        public C4405q(hn.c<? super C4405q> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49766a = obj;
            this.f49767b |= Integer.MIN_VALUE;
            return k.f(null, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$r, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseIconClicksTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123, 124}, m = "invokeSuspend")
    public static final class C4406r extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49770c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49771d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49772e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List f49773f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4406r(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, List list) {
            super(2, cVar);
            this.f49771d = xmlPullParser;
            this.f49772e = ref$ObjectRef;
            this.f49773f = list;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C4406r) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            C4406r c4406r = new C4406r(this.f49771d, cVar, this.f49772e, this.f49773f);
            c4406r.f49770c = obj;
            return c4406r;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
        /* JADX WARN: Type inference failed for: r4v22, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0072 -> B:60:0x010a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007c -> B:60:0x010a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ad -> B:60:0x010a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00bd -> B:42:0x00c2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d2 -> B:60:0x010a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00ec -> B:60:0x010a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0105 -> B:60:0x010a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 284
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4406r.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$s, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseIconClicksTag")
    public static final class C4407s extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f49777d;

        public C4407s(hn.c<? super C4407s> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49776c = obj;
            this.f49777d |= Integer.MIN_VALUE;
            return k.g(null, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$t, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseIconTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {130, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 139, 140}, m = "invokeSuspend")
    public static final class C4408t extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49781d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49782e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49783f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49784g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49785h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49786i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49787j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49788k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49789l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List f49790m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f49791n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4408t(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, Ref$ObjectRef ref$ObjectRef6, Ref$ObjectRef ref$ObjectRef7, Ref$ObjectRef ref$ObjectRef8, List list) {
            super(2, cVar);
            this.f49781d = xmlPullParser;
            this.f49782e = ref$ObjectRef;
            this.f49783f = ref$ObjectRef2;
            this.f49784g = ref$ObjectRef3;
            this.f49785h = ref$ObjectRef4;
            this.f49786i = ref$ObjectRef5;
            this.f49787j = ref$ObjectRef6;
            this.f49788k = ref$ObjectRef7;
            this.f49789l = ref$ObjectRef8;
            this.f49790m = list;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C4408t) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            C4408t c4408t = new C4408t(this.f49781d, cVar, this.f49782e, this.f49783f, this.f49784g, this.f49785h, this.f49786i, this.f49787j, this.f49788k, this.f49789l, this.f49790m);
            c4408t.f49780c = obj;
            return c4408t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:128:0x026b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0183  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01c1  */
        /* JADX WARN: Type inference failed for: r10v11, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r10v21, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v35, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0246 -> B:127:0x0264). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x025f -> B:127:0x0264). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b8 -> B:127:0x0264). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c2 -> B:127:0x0264). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x01a7 -> B:127:0x0264). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01b8 -> B:93:0x01bd). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 630
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4408t.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$u, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseIconTag")
    public static final class C4409u extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f49795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f49796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f49797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f49798g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f49799h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Object f49800i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49801j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f49802k;

        public C4409u(hn.c<? super C4409u> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49801j = obj;
            this.f49802k |= Integer.MIN_VALUE;
            return k.h(null, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$v, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseIconsTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123}, m = "invokeSuspend")
    public static final class C4410v extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List f49807e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4410v(XmlPullParser xmlPullParser, hn.c cVar, List list) {
            super(2, cVar);
            this.f49806d = xmlPullParser;
            this.f49807e = list;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C4410v) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            C4410v c4410v = new C4410v(this.f49806d, cVar, this.f49807e);
            c4410v.f49805c = obj;
            return c4410v;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0060 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006a -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0078 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0085 -> B:32:0x008a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x009d -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00b7 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d0 -> B:51:0x00d5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 231
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4410v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$w, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseIconsTag")
    public static final class C4411w extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f49809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f49810c;

        public C4411w(hn.c<? super C4411w> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49809b = obj;
            this.f49810c |= Integer.MIN_VALUE;
            return k.i(null, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$x, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseImpressionTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {}, m = "invokeSuspend")
    public static final class C4412x extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49814d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49815e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49816f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4412x(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            super(2, cVar);
            this.f49814d = xmlPullParser;
            this.f49815e = ref$ObjectRef;
            this.f49816f = ref$ObjectRef2;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C4412x) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            C4412x c4412x = new C4412x(this.f49814d, cVar, this.f49815e, this.f49816f);
            c4412x.f49813c = obj;
            return c4412x;
        }

        /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v22, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws XmlPullParserException, IOException {
            String text;
            in.a.g();
            if (this.f49812b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            kotlinx.coroutines.d.g((l0) this.f49813c);
            if (k.n0(this.f49814d)) {
                this.f49814d.nextTag();
            }
            if (k.i0(this.f49814d)) {
                return bn.r.f5635a;
            }
            if (!k.p0(this.f49814d)) {
                throw new XmlPullParserException("iterateCurrentTagEvents call is allowed only for START_TAG event");
            }
            int depth = this.f49814d.getDepth();
            while (this.f49814d.getDepth() >= depth) {
                int depth2 = this.f49814d.getDepth() - depth;
                if (depth2 != 0) {
                    if (depth2 == 1) {
                        k.p0(this.f49814d);
                    }
                } else if (k.p0(this.f49814d)) {
                    this.f49815e.element = k.G(this.f49814d, "id");
                } else if (k.r0(this.f49814d) && (text = this.f49814d.getText()) != null && !d0.u0(text)) {
                    String text2 = this.f49814d.getText();
                    tn.p.j(text2, "getText(...)");
                    this.f49816f.element = d0.s1(text2).toString();
                } else if (k.l0(this.f49814d)) {
                    return bn.r.f5635a;
                }
                this.f49814d.next();
            }
            return bn.r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$y, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt", f = "VastParser.kt", l = {941}, m = "parseImpressionTag")
    public static final class C4413y extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49819c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f49820d;

        public C4413y(hn.c<? super C4413y> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f49819c = obj;
            this.f49820d |= Integer.MIN_VALUE;
            return k.j(null, this);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$z, reason: case insensitive filesystem */
    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastParserKt$parseInLineTag$$inlined$iterateTag$1", f = "VastParser.kt", l = {123, 124, 125, 126, 127, 128, 130, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE}, m = "invokeSuspend")
    public static final class C4414z extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f49822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ XmlPullParser f49824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49827g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49828h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f49829i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List f49830j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List f49831k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List f49832l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4414z(XmlPullParser xmlPullParser, hn.c cVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, Ref$ObjectRef ref$ObjectRef5, List list, List list2, List list3) {
            super(2, cVar);
            this.f49824d = xmlPullParser;
            this.f49825e = ref$ObjectRef;
            this.f49826f = ref$ObjectRef2;
            this.f49827g = ref$ObjectRef3;
            this.f49828h = ref$ObjectRef4;
            this.f49829i = ref$ObjectRef5;
            this.f49830j = list;
            this.f49831k = list2;
            this.f49832l = list3;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((C4414z) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            C4414z c4414z = new C4414z(this.f49824d, cVar, this.f49825e, this.f49826f, this.f49827g, this.f49828h, this.f49829i, this.f49830j, this.f49831k, this.f49832l);
            c4414z.f49823c = obj;
            return c4414z;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:123:0x0245  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x018e  */
        /* JADX WARN: Type inference failed for: r2v41, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v43, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v47, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v49, types: [T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v51, types: [T, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x01e1 -> B:122:0x023e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x01f3 -> B:106:0x01f8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0206 -> B:122:0x023e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0220 -> B:122:0x023e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x0239 -> B:122:0x023e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00be -> B:122:0x023e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c8 -> B:122:0x023e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d0 -> B:122:0x023e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d7 -> B:122:0x023e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e2 -> B:122:0x023e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fb -> B:98:0x01d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00fd -> B:98:0x01d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x010a -> B:122:0x023e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x012d -> B:122:0x023e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0150 -> B:122:0x023e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0173 -> B:122:0x023e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x018c -> B:98:0x01d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x018e -> B:98:0x01d6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x019a -> B:122:0x023e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x01bc -> B:122:0x023e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            /*
                Method dump skipped, instruction units count: 648
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4414z.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @NotNull
    public static final w C() {
        return I();
    }

    public static final String G(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null || !(!d0.u0(attributeValue))) {
            return null;
        }
        return attributeValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G0(org.xmlpull.v1.XmlPullParser r6, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4392c
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$c r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4392c) r0
            int r1 = r0.f49681d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49681d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$c r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49680c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49681d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f49679b
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f49678a
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.c.b(r7)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.c.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$b r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$b
            r5.<init>(r6, r4, r2, r7)
            r0.f49678a = r7
            r0.f49679b = r2
            r0.f49681d = r3
            java.lang.Object r6 = kotlinx.coroutines.d.f(r5, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r6 = r2
        L5b:
            T r7 = r0.element
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L6a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.e
            T r6 = r6.element
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r4.<init>(r7, r6)
        L6a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G0(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H0(org.xmlpull.v1.XmlPullParser r6, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4394e
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$e r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4394e) r0
            int r1 = r0.f49691d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49691d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$e r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49690c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49691d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f49689b
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f49688a
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.c.b(r7)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.c.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$d r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$d
            r5.<init>(r6, r4, r2, r7)
            r0.f49688a = r7
            r0.f49689b = r2
            r0.f49691d = r3
            java.lang.Object r6 = kotlinx.coroutines.d.f(r5, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r6 = r2
        L5b:
            T r7 = r0.element
            if (r7 != 0) goto L64
            T r7 = r6.element
            if (r7 != 0) goto L64
            goto L71
        L64:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f
            T r7 = r0.element
            java.lang.String r7 = (java.lang.String) r7
            T r6 = r6.element
            java.lang.String r6 = (java.lang.String) r6
            r4.<init>(r7, r6)
        L71:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.H0(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    public static final j I() {
        return (j) f49497a.getValue();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i R(String str) {
        if (bo.a0.U(str, "image/", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.f49887a;
        }
        if (d0.a0(str, "javascript", true)) {
            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.f49888b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T(org.xmlpull.v1.XmlPullParser r17, boolean r18, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j> r19) {
        /*
            r0 = r19
            boolean r1 = r0 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4401m
            if (r1 == 0) goto L15
            r1 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$m r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4401m) r1
            int r2 = r1.f49754g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f49754g = r2
            goto L1a
        L15:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$m r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$m
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f49753f
            java.lang.Object r2 = in.a.g()
            int r3 = r1.f49754g
            r4 = 1
            if (r3 == 0) goto L47
            if (r3 != r4) goto L3f
            java.lang.Object r2 = r1.f49752e
            kotlin.jvm.internal.Ref$ObjectRef r2 = (kotlin.jvm.internal.Ref$ObjectRef) r2
            java.lang.Object r3 = r1.f49751d
            kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref$ObjectRef) r3
            java.lang.Object r4 = r1.f49750c
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            java.lang.Object r5 = r1.f49749b
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            java.lang.Object r1 = r1.f49748a
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            kotlin.c.b(r0)
            goto L91
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L47:
            kotlin.c.b(r0)
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
            r14.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r15 = new kotlin.jvm.internal.Ref$ObjectRef
            r15.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$l r12 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$l
            r7 = 0
            r5 = r12
            r6 = r17
            r8 = r0
            r9 = r3
            r10 = r14
            r11 = r15
            r16 = r12
            r12 = r13
            r4 = r13
            r13 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.f49748a = r0
            r1.f49749b = r3
            r1.f49750c = r14
            r1.f49751d = r15
            r1.f49752e = r4
            r5 = 1
            r1.f49754g = r5
            r5 = r16
            java.lang.Object r1 = kotlinx.coroutines.d.f(r5, r1)
            if (r1 != r2) goto L8c
            return r2
        L8c:
            r1 = r0
            r5 = r3
            r2 = r4
            r4 = r14
            r3 = r15
        L91:
            T r0 = r2.element
            r11 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k r11 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.k) r11
            if (r11 == 0) goto Lb3
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j
            T r1 = r1.element
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
            T r1 = r5.element
            r8 = r1
            java.lang.Integer r8 = (java.lang.Integer) r8
            T r1 = r4.element
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            T r1 = r3.element
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            goto Lb4
        Lb3:
            r0 = 0
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.T(org.xmlpull.v1.XmlPullParser, boolean, hn.c):java.lang.Object");
    }

    public static final SimpleDateFormat U() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w.b("HH:mm:ss.SSS");
    }

    public static final Long X(String str) {
        Object objM7534constructorimpl;
        Object objM7534constructorimpl2;
        try {
            Result.a aVar = Result.Companion;
            Date date = U().parse(str);
            objM7534constructorimpl = Result.m7534constructorimpl(date != null ? Long.valueOf(date.getTime()) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        Long l10 = (Long) objM7534constructorimpl;
        if (l10 != null) {
            return l10;
        }
        try {
            Date date2 = a0().parse(str);
            objM7534constructorimpl2 = Result.m7534constructorimpl(date2 != null ? Long.valueOf(date2.getTime()) : null);
        } catch (Throwable th3) {
            Result.a aVar3 = Result.Companion;
            objM7534constructorimpl2 = Result.m7534constructorimpl(kotlin.c.a(th3));
        }
        return (Long) (Result.m7539isFailureimpl(objM7534constructorimpl2) ? null : objM7534constructorimpl2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z(org.xmlpull.v1.XmlPullParser r5, boolean r6, hn.c<? super java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j>> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4403o
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$o r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4403o) r0
            int r1 = r0.f49763c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49763c = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$o r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49762b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49763c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f49761a
            java.util.List r5 = (java.util.List) r5
            kotlin.c.b(r7)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.c.b(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$n r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$n
            r4 = 0
            r2.<init>(r5, r4, r6, r7)
            r0.f49761a = r7
            r0.f49763c = r3
            java.lang.Object r5 = kotlinx.coroutines.d.f(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r5 = r7
        L4f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Z(org.xmlpull.v1.XmlPullParser, boolean, hn.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(org.xmlpull.v1.XmlPullParser r12, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c> r13) {
        /*
            boolean r0 = r13 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4396g
            if (r0 == 0) goto L13
            r0 = r13
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$g r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4396g) r0
            int r1 = r0.f49703e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49703e = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$g r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$g
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f49702d
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49703e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r12 = r0.f49701c
            kotlin.jvm.internal.Ref$ObjectRef r12 = (kotlin.jvm.internal.Ref$ObjectRef) r12
            java.lang.Object r1 = r0.f49700b
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r0 = r0.f49699a
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.c.b(r13)
            goto L6c
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3d:
            kotlin.c.b(r13)
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$f r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$f
            r6 = 0
            r4 = r11
            r5 = r12
            r7 = r13
            r8 = r2
            r9 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f49699a = r13
            r0.f49700b = r2
            r0.f49701c = r10
            r0.f49703e = r3
            java.lang.Object r12 = kotlinx.coroutines.d.f(r11, r0)
            if (r12 != r1) goto L69
            return r1
        L69:
            r0 = r13
            r1 = r2
            r12 = r10
        L6c:
            T r12 = r12.element
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d r12 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.d) r12
            if (r12 == 0) goto L80
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c r13 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c
            T r0 = r0.element
            java.lang.String r0 = (java.lang.String) r0
            T r1 = r1.element
            java.lang.Integer r1 = (java.lang.Integer) r1
            r13.<init>(r0, r1, r12)
            goto L81
        L80:
            r13 = 0
        L81:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.a(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    public static final SimpleDateFormat a0() {
        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w.b("HH:mm:ss");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(org.xmlpull.v1.XmlPullParser r5, hn.c<? super java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g>> r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4398i
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$i r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4398i) r0
            int r1 = r0.f49711c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49711c = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$i r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$i
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f49710b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49711c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f49709a
            java.util.List r5 = (java.util.List) r5
            kotlin.c.b(r6)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.c.b(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$h r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$h
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f49709a = r6
            r0.f49711c = r3
            java.lang.Object r5 = kotlinx.coroutines.d.f(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r5 = r6
        L4f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.b(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t b0(String str) {
        Long lX = X(str);
        if (lX != null) {
            return new t.b(lX.longValue());
        }
        Integer numF0 = f0(str);
        if (numF0 != null) {
            return new t.a(numF0.intValue());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(org.xmlpull.v1.XmlPullParser r25, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.g> r26) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    public static final Object d(XmlPullParser xmlPullParser, hn.c<? super String> cVar) {
        return p(xmlPullParser, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(org.xmlpull.v1.XmlPullParser r4, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l> r5) {
        /*
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4404p
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$p r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4404p) r0
            int r1 = r0.f49765b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49765b = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$p r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$p
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f49764a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49765b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.c.b(r5)
            r0.f49765b = r3
            java.lang.Object r5 = p(r4, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L47
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.l
            r4.<init>(r5)
            goto L48
        L47:
            r4 = 0
        L48:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e0(org.xmlpull.v1.XmlPullParser r19, boolean r20, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r> r21) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e0(org.xmlpull.v1.XmlPullParser, boolean, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(org.xmlpull.v1.XmlPullParser r4, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m> r5) {
        /*
            boolean r0 = r5 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4405q
            if (r0 == 0) goto L13
            r0 = r5
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$q r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4405q) r0
            int r1 = r0.f49767b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49767b = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$q r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$q
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f49766a
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49767b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.c.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.c.b(r5)
            r0.f49767b = r3
            java.lang.Object r5 = p(r4, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L47
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.m
            r4.<init>(r5)
            goto L48
        L47:
            r4 = 0
        L48:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    public static final Integer f0(String str) {
        Object objM7534constructorimpl;
        Integer numValueOf;
        int iIntValue;
        try {
            Result.a aVar = Result.Companion;
            Number number = f49498b.parse(str);
            if (number == null || (iIntValue = (numValueOf = Integer.valueOf((int) (number.floatValue() * 100))).intValue()) < 0 || iIntValue >= 101) {
                numValueOf = null;
            }
            objM7534constructorimpl = Result.m7534constructorimpl(numValueOf);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        return (Integer) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(org.xmlpull.v1.XmlPullParser r6, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4407s
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$s r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4407s) r0
            int r1 = r0.f49777d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49777d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$s r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$s
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49776c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49777d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f49775b
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r0.f49774a
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.c.b(r7)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.c.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$r r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$r
            r5.<init>(r6, r4, r7, r2)
            r0.f49774a = r7
            r0.f49775b = r2
            r0.f49777d = r3
            java.lang.Object r6 = kotlinx.coroutines.d.f(r5, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r6 = r2
        L5b:
            T r7 = r0.element
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L66
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.o
            r4.<init>(r7, r6)
        L66:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.g(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(org.xmlpull.v1.XmlPullParser r24, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n> r25) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h0(org.xmlpull.v1.XmlPullParser r12, boolean r13, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a> r14) {
        /*
            boolean r0 = r14 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.X
            if (r0 == 0) goto L13
            r0 = r14
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$X r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.X) r0
            int r1 = r0.f49653f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49653f = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$X r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$X
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f49652e
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49653f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            boolean r13 = r0.f49648a
            java.lang.Object r12 = r0.f49651d
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r1 = r0.f49650c
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f49649b
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.c.b(r14)
            goto L70
        L37:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3f:
            kotlin.c.b(r14)
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
            r14.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$W r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$W
            r6 = 0
            r4 = r11
            r5 = r12
            r7 = r14
            r8 = r2
            r9 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f49649b = r14
            r0.f49650c = r2
            r0.f49651d = r10
            r0.f49648a = r13
            r0.f49653f = r3
            java.lang.Object r12 = kotlinx.coroutines.d.f(r11, r0)
            if (r12 != r1) goto L6d
            return r1
        L6d:
            r0 = r14
            r1 = r2
            r12 = r10
        L70:
            if (r13 == 0) goto L78
            T r13 = r0.element
            if (r13 != 0) goto L78
            r12 = 0
            goto L82
        L78:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a r13 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a
            T r14 = r0.element
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0 r14 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0) r14
            r13.<init>(r14, r1, r12)
            r12 = r13
        L82:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.h0(org.xmlpull.v1.XmlPullParser, boolean, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(org.xmlpull.v1.XmlPullParser r5, hn.c<? super java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.n>> r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4411w
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$w r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4411w) r0
            int r1 = r0.f49810c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49810c = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$w r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$w
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f49809b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49810c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f49808a
            java.util.List r5 = (java.util.List) r5
            kotlin.c.b(r6)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.c.b(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$v r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$v
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f49808a = r6
            r0.f49810c = r3
            java.lang.Object r5 = kotlinx.coroutines.d.f(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r5 = r6
        L4f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    public static final boolean i0(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(org.xmlpull.v1.XmlPullParser r6, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4413y
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$y r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.C4413y) r0
            int r1 = r0.f49820d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49820d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$y r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$y
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49819c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49820d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f49818b
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f49817a
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.c.b(r7)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.c.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$x r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$x
            r5.<init>(r6, r4, r7, r2)
            r0.f49817a = r7
            r0.f49818b = r2
            r0.f49820d = r3
            java.lang.Object r6 = kotlinx.coroutines.d.f(r5, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r6 = r2
        L5b:
            T r6 = r6.element
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L6a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.p
            T r7 = r0.element
            java.lang.String r7 = (java.lang.String) r7
            r4.<init>(r7, r6)
        L6a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v j0(String str) {
        switch (str.hashCode()) {
            case -1638835128:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT)) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49947d;
                }
                return null;
            case -1337830390:
                if (str.equals("thirdQuartile")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49948e;
                }
                return null;
            case -1001078227:
                if (str.equals("progress")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49957n;
                }
                return null;
            case -934426579:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49954k;
                }
                return null;
            case -934318917:
                if (str.equals("rewind")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49953j;
                }
                return null;
            case -840405966:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE)) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49951h;
                }
                return null;
            case -599445191:
                if (str.equals("complete")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49949f;
                }
                return null;
            case -37683395:
                if (str.equals("closeLinear")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49955l;
                }
                return null;
            case 3363353:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49950g;
                }
                return null;
            case 3532159:
                if (str.equals("skip")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49956m;
                }
                return null;
            case 106440182:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49952i;
                }
                return null;
            case 109757538:
                if (str.equals("start")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49945b;
                }
                return null;
            case 560220243:
                if (str.equals("firstQuartile")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49946c;
                }
                return null;
            case 1778167540:
                if (str.equals("creativeView")) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49944a;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(org.xmlpull.v1.XmlPullParser r20, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.q> r21) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.k(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(org.xmlpull.v1.XmlPullParser r31, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s> r32) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.l(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    public static final boolean l0(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(org.xmlpull.v1.XmlPullParser r5, hn.c<? super java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s>> r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$G r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.G) r0
            int r1 = r0.f49568c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49568c = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$G r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$G
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f49567b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49568c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f49566a
            java.util.List r5 = (java.util.List) r5
            kotlin.c.b(r6)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.c.b(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$F r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$F
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f49566a = r6
            r0.f49568c = r3
            java.lang.Object r5 = kotlinx.coroutines.d.f(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r5 = r6
        L4f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.m(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(org.xmlpull.v1.XmlPullParser r6, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.I
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$I r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.I) r0
            int r1 = r0.f49578d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49578d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$I r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$I
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49577c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49578d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f49576b
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f49575a
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.c.b(r7)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.c.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$H r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$H
            r5.<init>(r6, r4, r7, r2)
            r0.f49575a = r7
            r0.f49576b = r2
            r0.f49578d = r3
            java.lang.Object r6 = kotlinx.coroutines.d.f(r5, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r6 = r2
        L5b:
            T r7 = r0.element
            if (r7 != 0) goto L64
            T r7 = r6.element
            if (r7 != 0) goto L64
            goto L71
        L64:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.u
            T r7 = r0.element
            java.lang.String r7 = (java.lang.String) r7
            T r6 = r6.element
            java.lang.String r6 = (java.lang.String) r6
            r4.<init>(r7, r6)
        L71:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    public static final boolean n0(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(org.xmlpull.v1.XmlPullParser r6, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.K
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$K r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.K) r0
            int r1 = r0.f49588d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49588d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$K r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$K
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49587c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49588d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f49586b
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f49585a
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.c.b(r7)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.c.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$J r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$J
            r5.<init>(r6, r4, r2, r7)
            r0.f49585a = r7
            r0.f49586b = r2
            r0.f49588d = r3
            java.lang.Object r6 = kotlinx.coroutines.d.f(r5, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r6 = r2
        L5b:
            T r7 = r0.element
            if (r7 == 0) goto L77
            T r7 = r6.element
            if (r7 != 0) goto L64
            goto L77
        L64:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w
            T r7 = r0.element
            tn.p.h(r7)
            java.lang.String r7 = (java.lang.String) r7
            T r6 = r6.element
            tn.p.h(r6)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i r6 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i) r6
            r4.<init>(r7, r6)
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(org.xmlpull.v1.XmlPullParser r5, hn.c<? super java.lang.String> r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$M r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M) r0
            int r1 = r0.f49596c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49596c = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$M r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$M
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f49595b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49596c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f49594a
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            kotlin.c.b(r6)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.c.b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$L r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$L
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f49594a = r6
            r0.f49596c = r3
            java.lang.Object r5 = kotlinx.coroutines.d.f(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r5 = r6
        L4f:
            T r5 = r5.element
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.p(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    public static final boolean p0(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(org.xmlpull.v1.XmlPullParser r5, hn.c<? super java.util.List<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y>> r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$O r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O) r0
            int r1 = r0.f49604c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49604c = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$O r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$O
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f49603b
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49604c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f49602a
            java.util.List r5 = (java.util.List) r5
            kotlin.c.b(r6)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.c.b(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$N r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$N
            r4 = 0
            r2.<init>(r5, r4, r6)
            r0.f49602a = r6
            r0.f49604c = r3
            java.lang.Object r5 = kotlinx.coroutines.d.f(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r5 = r6
        L4f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(org.xmlpull.v1.XmlPullParser r12, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y> r13) {
        /*
            boolean r0 = r13 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Q
            if (r0 == 0) goto L13
            r0 = r13
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$Q r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Q) r0
            int r1 = r0.f49616e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49616e = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$Q r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$Q
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f49615d
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49616e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r12 = r0.f49614c
            kotlin.jvm.internal.Ref$ObjectRef r12 = (kotlin.jvm.internal.Ref$ObjectRef) r12
            java.lang.Object r1 = r0.f49613b
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r0 = r0.f49612a
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.c.b(r13)
            goto L6c
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3d:
            kotlin.c.b(r13)
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$P r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$P
            r6 = 0
            r4 = r11
            r5 = r12
            r7 = r13
            r8 = r10
            r9 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f49612a = r13
            r0.f49613b = r2
            r0.f49614c = r10
            r0.f49616e = r3
            java.lang.Object r12 = kotlinx.coroutines.d.f(r11, r0)
            if (r12 != r1) goto L69
            return r1
        L69:
            r0 = r13
            r1 = r2
            r12 = r10
        L6c:
            T r13 = r0.element
            if (r13 == 0) goto L95
            T r2 = r1.element
            if (r2 == 0) goto L95
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v r2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v.f49957n
            if (r13 != r2) goto L7d
            T r13 = r12.element
            if (r13 != 0) goto L7d
            goto L95
        L7d:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y r13 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y
            T r0 = r0.element
            tn.p.h(r0)
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.v) r0
            T r1 = r1.element
            tn.p.h(r1)
            java.lang.String r1 = (java.lang.String) r1
            T r12 = r12.element
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t r12 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t) r12
            r13.<init>(r0, r1, r12)
            goto L96
        L95:
            r13 = 0
        L96:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.r(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    public static final boolean r0(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 4;
    }

    public static final Object s(XmlPullParser xmlPullParser, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z> cVar) {
        return p000do.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new R(xmlPullParser, null), cVar);
    }

    public static final Integer s0(XmlPullParser xmlPullParser) {
        String strG = G(xmlPullParser, "sequence");
        if (strG == null) {
            return null;
        }
        Integer numR = bo.z.r(strG);
        return Integer.valueOf(numR != null ? numR.intValue() : 999);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(org.xmlpull.v1.XmlPullParser r12, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z> r13) {
        /*
            boolean r0 = r13 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.T
            if (r0 == 0) goto L13
            r0 = r13
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$T r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.T) r0
            int r1 = r0.f49630e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49630e = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$T r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$T
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f49629d
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49630e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r12 = r0.f49628c
            kotlin.jvm.internal.Ref$ObjectRef r12 = (kotlin.jvm.internal.Ref$ObjectRef) r12
            java.lang.Object r1 = r0.f49627b
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r0 = r0.f49626a
            java.util.List r0 = (java.util.List) r0
            kotlin.c.b(r13)
            goto L6c
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3d:
            kotlin.c.b(r13)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$S r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$S
            r6 = 0
            r4 = r11
            r5 = r12
            r7 = r2
            r8 = r10
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f49626a = r13
            r0.f49627b = r2
            r0.f49628c = r10
            r0.f49630e = r3
            java.lang.Object r12 = kotlinx.coroutines.d.f(r11, r0)
            if (r12 != r1) goto L69
            return r1
        L69:
            r0 = r13
            r1 = r2
            r12 = r10
        L6c:
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto L78
            T r13 = r12.element
            if (r13 != 0) goto L78
            r12 = 0
            goto L86
        L78:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z r13 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.z
            T r12 = r12.element
            java.lang.String r12 = (java.lang.String) r12
            T r1 = r1.element
            java.lang.String r1 = (java.lang.String) r1
            r13.<init>(r0, r12, r1)
            r12 = r13
        L86:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.t(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(org.xmlpull.v1.XmlPullParser r6, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0> r7) {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.V
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$V r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.V) r0
            int r1 = r0.f49640d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49640d = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$V r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$V
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f49639c
            java.lang.Object r1 = in.a.g()
            int r2 = r0.f49640d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.f49638b
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r0.f49637a
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            kotlin.c.b(r7)
            goto L5b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.c.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$U r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$U
            r5.<init>(r6, r4, r7, r2)
            r0.f49637a = r7
            r0.f49638b = r2
            r0.f49640d = r3
            java.lang.Object r6 = kotlinx.coroutines.d.f(r5, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            r0 = r7
            r6 = r2
        L5b:
            T r6 = r6.element
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L6a
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0 r4 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b0
            T r7 = r0.element
            java.lang.String r7 = (java.lang.String) r7
            r4.<init>(r7, r6)
        L6a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.u(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t u0(XmlPullParser xmlPullParser) {
        String strG = G(xmlPullParser, VastAttributes.SKIP_OFFSET);
        if (strG != null) {
            return b0(strG);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(org.xmlpull.v1.XmlPullParser r17, hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Z
            if (r1 == 0) goto L15
            r1 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$Z r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.Z) r1
            int r2 = r1.f49671h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f49671h = r2
            goto L1a
        L15:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$Z r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$Z
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f49670g
            java.lang.Object r2 = in.a.g()
            int r3 = r1.f49671h
            r4 = 1
            if (r3 == 0) goto L4e
            if (r3 != r4) goto L46
            java.lang.Object r2 = r1.f49669f
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = r1.f49668e
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r1.f49667d
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r1.f49666c
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            java.lang.Object r6 = r1.f49665b
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r1 = r1.f49664a
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            kotlin.c.b(r0)
            r8 = r2
            r7 = r3
            r15 = r4
            goto La3
        L46:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L4e:
            kotlin.c.b(r0)
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r14 = new kotlin.jvm.internal.Ref$ObjectRef
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$Y r11 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k$Y
            r7 = 0
            r5 = r11
            r6 = r17
            r8 = r3
            r9 = r0
            r10 = r14
            r16 = r11
            r11 = r15
            r17 = r12
            r12 = r13
            r4 = r13
            r13 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.f49664a = r0
            r1.f49665b = r3
            r1.f49666c = r14
            r1.f49667d = r15
            r1.f49668e = r4
            r5 = r17
            r1.f49669f = r5
            r6 = 1
            r1.f49671h = r6
            r6 = r16
            java.lang.Object r1 = kotlinx.coroutines.d.f(r6, r1)
            if (r1 != r2) goto L9e
            return r2
        L9e:
            r1 = r0
            r6 = r3
            r7 = r4
            r8 = r5
            r5 = r14
        La3:
            T r0 = r1.element
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lbc
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.b
            T r1 = r6.element
            r4 = r1
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            T r1 = r5.element
            r5 = r1
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.f) r5
            r2 = r0
            r6 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto Lbd
        Lbc:
            r0 = 0
        Lbd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v(org.xmlpull.v1.XmlPullParser, hn.c):java.lang.Object");
    }

    public static final j w() {
        return new j();
    }
}
