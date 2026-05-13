package com.ironsource;

import com.ironsource.InterfaceC4262t4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C4065i1 implements InterfaceC4209q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4118l1 f31910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final F7 f31911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Kb<Integer, Integer> f31912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4262t4 f31913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private List<InterfaceC4156n1> f31914e;

    public C4065i1(@NotNull InterfaceC4118l1 interfaceC4118l1, @NotNull F7 f72, @NotNull Kb<Integer, Integer> kb2, @NotNull InterfaceC4262t4 interfaceC4262t4) {
        tn.p.k(interfaceC4118l1, "eventBaseData");
        tn.p.k(f72, "eventsManager");
        tn.p.k(kb2, "eventsMapper");
        tn.p.k(interfaceC4262t4, "currentTimeProvider");
        this.f31910a = interfaceC4118l1;
        this.f31911b = f72;
        this.f31912c = kb2;
        this.f31913d = interfaceC4262t4;
        this.f31914e = new ArrayList();
    }

    public /* synthetic */ C4065i1(InterfaceC4118l1 interfaceC4118l1, F7 f72, Kb kb2, InterfaceC4262t4 interfaceC4262t4, int i10, tn.i iVar) {
        this(interfaceC4118l1, f72, kb2, (i10 & 8) != 0 ? new InterfaceC4262t4.a() : interfaceC4262t4);
    }

    private final JSONObject b(List<? extends InterfaceC4156n1> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC4156n1> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC4209q1
    public void a() {
        this.f31914e.clear();
    }

    @Override // com.ironsource.InterfaceC4209q1
    public void a(int i10, @NotNull List<InterfaceC4156n1> list) {
        tn.p.k(list, "arrayList");
        try {
            Iterator<T> it = this.f31910a.a().iterator();
            while (it.hasNext()) {
                list.add((InterfaceC4156n1) it.next());
            }
            Iterator<InterfaceC4156n1> it2 = this.f31914e.iterator();
            while (it2.hasNext()) {
                list.add(it2.next());
            }
            this.f31911b.a(new C5(this.f31912c.a(Integer.valueOf(i10)).intValue(), this.f31913d.a(), b(list)));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            System.out.println((Object) ("LogRemote | Exception: " + e10.getMessage()));
        }
    }

    public final void a(@NotNull List<InterfaceC4156n1> list) {
        tn.p.k(list, "<set-?>");
        this.f31914e = list;
    }

    @Override // com.ironsource.InterfaceC4209q1
    public void a(@NotNull InterfaceC4156n1... interfaceC4156n1Arr) {
        tn.p.k(interfaceC4156n1Arr, "analyticsEventEntity");
        for (InterfaceC4156n1 interfaceC4156n1 : interfaceC4156n1Arr) {
            this.f31914e.add(interfaceC4156n1);
        }
    }

    @NotNull
    public final List<InterfaceC4156n1> b() {
        return this.f31914e;
    }
}
