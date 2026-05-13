package yads;

import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yads.qd0;

/* JADX INFO: loaded from: classes4.dex */
public final class qd0 extends com.google.common.collect.q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f94010b;

    public qd0(Map map) {
        this.f94010b = map;
    }

    public static /* synthetic */ boolean a(String str) {
        return str != null;
    }

    public static /* synthetic */ boolean a(Map.Entry entry) {
        return entry.getKey() != null;
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final boolean containsValue(Object obj) {
        return standardContainsValue(obj);
    }

    @Override // com.google.common.collect.q1, com.google.common.collect.r1
    /* JADX INFO: renamed from: delegate */
    public final Object g() {
        return this.f94010b;
    }

    @Override // com.google.common.collect.q1, com.google.common.collect.r1
    /* JADX INFO: renamed from: delegate */
    public final Map g() {
        return this.f94010b;
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final Set entrySet() {
        return Sets.b(super.entrySet(), new y7.m() { // from class: bt.t8
            @Override // y7.m
            public final boolean apply(Object obj) {
                return qd0.a((Map.Entry) obj);
            }
        });
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && standardEquals(obj);
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final int hashCode() {
        return standardHashCode();
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final boolean isEmpty() {
        if (super.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final Set keySet() {
        return Sets.b(super.keySet(), new y7.m() { // from class: bt.u8
            @Override // y7.m
            public final boolean apply(Object obj) {
                return qd0.a((String) obj);
            }
        });
    }

    @Override // com.google.common.collect.q1, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
