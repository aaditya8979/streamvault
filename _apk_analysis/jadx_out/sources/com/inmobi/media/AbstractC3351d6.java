package com.inmobi.media;

import com.inmobi.media.AbstractC3351d6;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.inmobi.media.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3351d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3431g9 f27017b;

    public AbstractC3351d6(String str, C3431g9 c3431g9) {
        tn.p.k(str, "tableName");
        tn.p.k(c3431g9, "databaseHelper");
        this.f27016a = str;
        this.f27017b = c3431g9;
    }

    public static final CharSequence a(int i10) {
        return String.valueOf(i10);
    }

    public final Object a(int i10, ContinuationImpl continuationImpl) {
        String str = this.f27016a;
        Object objA = this.f27017b.a("DELETE FROM " + str + " WHERE id IN (SELECT id FROM " + str + " ORDER BY ts ASC LIMIT " + i10 + ")", continuationImpl);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    public final Object a(long j10, ContinuationImpl continuationImpl) {
        Object objA = C3431g9.a(this.f27017b, this.f27016a, "ts < " + j10, continuationImpl, 4);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    public final Object a(ArrayList arrayList, SuspendLambda suspendLambda) {
        if (arrayList.isEmpty()) {
            return bn.r.f5635a;
        }
        String strD0 = cn.f0.D0(arrayList, StringUtils.COMMA, null, null, 0, null, new sn.l() { // from class: n9.o6
            @Override // sn.l
            public final Object invoke(Object obj) {
                return AbstractC3351d6.a(((Integer) obj).intValue());
            }
        }, 30, null);
        Object objA = C3431g9.a(this.f27017b, this.f27016a, "id IN (" + strD0 + ")", suspendLambda, 4);
        return objA == in.a.g() ? objA : bn.r.f5635a;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        String str = "SELECT COUNT(*) FROM " + this.f27016a;
        C3431g9 c3431g9 = this.f27017b;
        c3431g9.getClass();
        return c3431g9.a(new Y8(c3431g9, str, null), continuationImpl);
    }

    public abstract Object b(int i10, ContinuationImpl continuationImpl);
}
