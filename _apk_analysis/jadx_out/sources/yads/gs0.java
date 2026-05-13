package yads;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$layout;
import java.util.LinkedHashMap;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gs0 extends ListAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashMap f90097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ds0 f90098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f90099g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.yt0 r19, int r20) {
        /*
            r18 = this;
            r0 = r19
            java.util.List r1 = r18.getCurrentList()
            r2 = r20
            java.lang.Object r1 = r1.get(r2)
            yads.ut0 r1 = (yads.ut0) r1
            boolean r2 = r0 instanceof yads.jt0
            if (r2 == 0) goto L9e
            boolean r2 = r1 instanceof yads.ns0
            if (r2 == 0) goto L9e
            yads.jt0 r0 = (yads.jt0) r0
            yads.ns0 r1 = (yads.ns0) r1
            yads.ps0 r2 = r0.f91352b
            android.view.ViewGroup r0 = r0.f91351a
            android.content.Context r0 = r0.getContext()
            yads.v9 r5 = r1.f92923b
            yads.v22 r6 = r1.f92922a
            java.util.List r1 = r1.f92924c
            yads.hs0 r3 = r2.f93747d
            android.view.ViewGroup r9 = r2.f93744a
            yads.z00 r7 = r2.f93745b
            android.view.ViewTreeObserver$OnPreDrawListener r10 = r2.f93749f
            yads.lh3 r8 = r2.f93746c
            yads.rs0 r3 = r3.f90525a
            yads.oi0 r4 = r3.f94602c
            r4.getClass()
            boolean r4 = yads.oi0.a(r0)
            r11 = 0
            if (r4 == 0) goto L7c
            java.util.Iterator r1 = r1.iterator()
        L44:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L60
            java.lang.Object r4 = r1.next()
            r12 = r4
            yads.hi2 r12 = (yads.hi2) r12
            yads.gi0 r12 = r12.f90429a
            java.lang.String r12 = r12.f89988a
            yads.fg0[] r13 = yads.fg0.f89568b
            java.lang.String r13 = "ad"
            boolean r12 = tn.p.f(r12, r13)
            if (r12 == 0) goto L44
            goto L61
        L60:
            r4 = r11
        L61:
            r13 = r4
            yads.hi2 r13 = (yads.hi2) r13
            if (r13 == 0) goto L7c
            yads.qs0 r1 = new yads.qs0
            yads.d4 r14 = r3.f94600a
            yads.lu2 r15 = r3.f94601b
            yads.qh0 r16 = new yads.qh0
            r16.<init>()
            yads.ve1 r17 = new yads.ve1
            r17.<init>()
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            r3 = r1
            goto L7d
        L7c:
            r3 = r11
        L7d:
            if (r3 == 0) goto L85
            r4 = r0
            yads.se1 r1 = r3.a(r4, r5, r6, r7, r8)
            goto L86
        L85:
            r1 = r11
        L86:
            yads.cn r3 = new yads.cn
            yads.bn r4 = new yads.bn
            java.util.List r1 = cn.w.q(r1)
            r4.<init>(r0, r9, r1, r10)
            r3.<init>(r4)
            r2.f93748e = r3
            yads.os0 r0 = new yads.os0
            r0.<init>()
            r3.a(r11, r0)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.gs0.a(yads.yt0, int):void");
    }

    public static final void access$unbindHolder(gs0 gs0Var, yt0 yt0Var) {
        gs0Var.getClass();
        cn cnVar = null;
        jt0 jt0Var = yt0Var instanceof jt0 ? (jt0) yt0Var : null;
        if (jt0Var != null) {
            cn cnVar2 = jt0Var.f91352b.f93748e;
            if (cnVar2 == null) {
                tn.p.C("contentController");
            } else {
                cnVar = cnVar2;
            }
            an anVar = cnVar.f88507a.f88088e;
            lm2 lm2Var = anVar.f87751c;
            KProperty kProperty = an.f87748d[0];
            ViewGroup viewGroup = (ViewGroup) lm2Var.f92035a.get();
            if (viewGroup != null) {
                nk3.a(viewGroup);
            }
            zf0 zf0Var = anVar.f87750b;
            if (zf0Var != null) {
                zf0Var.c();
            }
        }
    }

    public static final void access$unregisterTrackers(gs0 gs0Var) {
        gs0Var.getClass();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        if (this.f90099g) {
            return;
        }
        this.f90099g = true;
        new Object() { // from class: bt.g2
        };
        throw null;
    }

    @Override // androidx.recyclerview.widget.ListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getCurrentList().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return tn.p.f(getCurrentList().get(i10), tt0.f95349a) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        ds0 ds0Var = this.f90098f;
        if (ds0Var == null) {
            ds0Var = new ds0(this);
        }
        this.f90098f = ds0Var;
        recyclerView.removeOnAttachStateChangeListener(ds0Var);
        recyclerView.addOnAttachStateChangeListener(ds0Var);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull yt0 yt0Var, int i10) {
        this.f90097e.put(yt0Var, Integer.valueOf(i10));
        a(yt0Var, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public yt0 onCreateViewHolder(@NotNull ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        if (i10 != 0) {
            return new rt0(LayoutInflater.from(context).inflate(R$layout.monetization_ads_feed_progressbar, viewGroup, false));
        }
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.monetization_ads_feed_item, viewGroup, false);
        tn.p.i(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        ds0 ds0Var = this.f90098f;
        if (ds0Var != null) {
            recyclerView.removeOnAttachStateChangeListener(ds0Var);
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull yt0 yt0Var) {
        super.onViewAttachedToWindow(yt0Var);
        yt0Var.getBindingAdapterPosition();
        if (yt0Var instanceof jt0) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NotNull yt0 yt0Var) {
        super.onViewDetachedFromWindow(yt0Var);
        View view = yt0Var.itemView;
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull yt0 yt0Var) {
        super.onViewRecycled(yt0Var);
        this.f90097e.remove(yt0Var);
        cn cnVar = null;
        jt0 jt0Var = yt0Var instanceof jt0 ? (jt0) yt0Var : null;
        if (jt0Var != null) {
            cn cnVar2 = jt0Var.f91352b.f93748e;
            if (cnVar2 == null) {
                tn.p.C("contentController");
            } else {
                cnVar = cnVar2;
            }
            an anVar = cnVar.f88507a.f88088e;
            lm2 lm2Var = anVar.f87751c;
            KProperty kProperty = an.f87748d[0];
            ViewGroup viewGroup = (ViewGroup) lm2Var.f92035a.get();
            if (viewGroup != null) {
                nk3.a(viewGroup);
            }
            zf0 zf0Var = anVar.f87750b;
            if (zf0Var != null) {
                zf0Var.c();
            }
        }
    }
}
