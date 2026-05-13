package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class Zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4926l2 f66313a;

    public Zk(InterfaceC4926l2 interfaceC4926l2) {
        this.f66313a = interfaceC4926l2;
    }

    public final ArrayList a(Iterable iterable) {
        String hexString;
        String strA;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                strA = this.f66313a.a(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (strA == null || (hexString = StringUtils.toHexString(MessageDigest.getInstance("SHA-256").digest(strA.getBytes(bo.c.f5639b)))) == null) {
                PublicLogger.INSTANCE.getAnonymousInstance().info("Input " + str + " is not a valid data", new Object[0]);
                hexString = null;
            }
            if (hexString != null) {
                arrayList.add(hexString);
            }
        }
        return arrayList;
    }
}
