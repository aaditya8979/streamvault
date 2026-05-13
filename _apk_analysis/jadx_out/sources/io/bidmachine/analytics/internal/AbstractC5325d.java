package io.bidmachine.analytics.internal;

import io.bidmachine.analytics.ReaderConfig;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.Metadata;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lio/bidmachine/analytics/internal/d;", "Lio/bidmachine/analytics/internal/i;", "Lio/bidmachine/analytics/ReaderConfig$Rule;", "rule", "Ljava/io/File;", "a", "(Lio/bidmachine/analytics/ReaderConfig$Rule;)Ljava/io/File;", "", "(Lio/bidmachine/analytics/ReaderConfig$Rule;Lhn/c;)Ljava/lang/Object;", "<init>", "()V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public abstract class AbstractC5325d extends AbstractC5330i {
    public static /* synthetic */ Object a(AbstractC5325d abstractC5325d, ReaderConfig.Rule rule, hn.c<? super String> cVar) throws FileNotFoundException {
        File fileA = abstractC5325d.a(rule);
        if (!fileA.exists()) {
            throw new FileNotFoundException();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fileA.lastModified());
        sb2.append('_');
        sb2.append(fileA.length());
        return sb2.toString();
    }

    public abstract File a(ReaderConfig.Rule rule);

    @Override // io.bidmachine.analytics.internal.AbstractC5330i
    public Object a(ReaderConfig.Rule rule, hn.c<? super String> cVar) {
        return a(this, rule, cVar);
    }
}
