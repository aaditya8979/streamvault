package io.bidmachine.rendering.internal.animation;

import cn.v;
import io.bidmachine.rendering.model.EventType;
import java.util.List;
import tn.p;

/* JADX INFO: loaded from: classes.dex */
public final class c implements io.bidmachine.rendering.internal.event.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f70104c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List f70105d = v.e(EventType.OnClick);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f70106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final sn.a f70107b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public c(b bVar, sn.a aVar) {
        p.k(bVar, "animationController");
        this.f70106a = bVar;
        this.f70107b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    @Override // io.bidmachine.rendering.internal.event.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.util.List r8) {
        /*
            r7 = this;
            java.lang.String r0 = "params"
            tn.p.k(r8, r0)
            r0 = 0
            java.lang.Object r1 = cn.f0.w0(r8, r0)
            boolean r2 = r1 instanceof io.bidmachine.rendering.model.EventType
            if (r2 != 0) goto Lf
            return r0
        Lf:
            r2 = 1
            java.lang.Object r8 = cn.f0.w0(r8, r2)
            boolean r3 = r8 instanceof java.lang.Integer
            if (r3 != 0) goto L19
            return r0
        L19:
            java.util.List r3 = io.bidmachine.rendering.internal.animation.c.f70105d
            boolean r3 = r3.contains(r1)
            if (r3 != 0) goto L22
            return r0
        L22:
            sn.a r3 = r7.f70107b
            r4 = 0
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r3.invoke()
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L2f
        L2e:
            r3 = r4
        L2f:
            if (r3 == 0) goto L46
            int r5 = r3.intValue()
            r6 = -1
            if (r5 == r6) goto L39
            r4 = r3
        L39:
            if (r4 == 0) goto L46
            int r3 = r4.intValue()
            io.bidmachine.rendering.internal.animation.b r4 = r7.f70106a
            boolean r3 = r4.a(r3)
            goto L47
        L46:
            r3 = r0
        L47:
            io.bidmachine.rendering.internal.animation.b r4 = r7.f70106a
            r5 = r8
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            boolean r4 = r4.a(r5)
            if (r3 != 0) goto L5a
            if (r4 == 0) goto L59
            goto L5a
        L59:
            r2 = r0
        L5a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Intercept result="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = "; eventType="
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = "; viewId="
            r3.append(r1)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "AdAnimationEventInterceptor"
            io.bidmachine.rendering.internal.o.b(r1, r8, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.rendering.internal.animation.c.a(java.util.List):boolean");
    }
}
