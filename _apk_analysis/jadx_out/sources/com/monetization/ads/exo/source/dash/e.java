package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import yads.bg1;
import yads.bn1;
import yads.c30;
import yads.eg1;
import yads.f30;
import yads.fc2;
import yads.fg1;
import yads.hb3;
import yads.hm1;
import yads.ib3;
import yads.ih1;
import yads.ob2;
import yads.p11;
import yads.q30;
import yads.qb2;
import yads.vf1;
import yads.yf1;
import yads.zf1;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements yf1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f51033b;

    public e(i iVar) {
        this.f51033b = iVar;
    }

    @Override // yads.yf1
    public final zf1 a(bg1 bg1Var, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        qb2 qb2Var = (qb2) bg1Var;
        i iVar = this.f51033b;
        iVar.getClass();
        long j12 = qb2Var.f93973a;
        Uri uri = qb2Var.f93976d.f94279c;
        vf1 vf1Var = new vf1();
        iVar.f51042n.getClass();
        if ((iOException instanceof ob2) || (iOException instanceof FileNotFoundException) || (iOException instanceof p11) || (iOException instanceof eg1)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i11 = q30.f93872c;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof q30) && ((q30) cause).f93873b == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        zf1 zf1Var = jMin == -9223372036854775807L ? fg1.f89570e : new zf1(0, jMin);
        int i12 = zf1Var.f97559a;
        boolean z10 = true ^ (i12 == 0 || i12 == 1);
        bn1 bn1Var = iVar.f51045q;
        bn1Var.a(vf1Var, new hm1(qb2Var.f93975c, -1, null, 0, null, bn1Var.a(-9223372036854775807L), bn1Var.a(-9223372036854775807L)), iOException, z10);
        if (z10) {
            iVar.f51042n.getClass();
        }
        return zf1Var;
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11) {
        long j12;
        qb2 qb2Var = (qb2) bg1Var;
        i iVar = this.f51033b;
        iVar.getClass();
        long j13 = qb2Var.f93973a;
        Uri uri = qb2Var.f93976d.f94279c;
        vf1 vf1Var = new vf1();
        iVar.f51042n.getClass();
        bn1 bn1Var = iVar.f51045q;
        bn1Var.b(vf1Var, new hm1(qb2Var.f93975c, -1, null, 0, null, bn1Var.a(-9223372036854775807L), bn1Var.a(-9223372036854775807L)));
        c30 c30Var = (c30) qb2Var.f93978f;
        c30 c30Var2 = iVar.H;
        int size = c30Var2 == null ? 0 : c30Var2.f88318m.size();
        long j14 = ((fc2) c30Var.f88318m.get(0)).f89531b;
        int i10 = 0;
        while (i10 < size && ((fc2) iVar.H.f88318m.get(i10)).f89531b < j14) {
            i10++;
        }
        if (c30Var.f88309d) {
            if (size - i10 > c30Var.f88318m.size()) {
                ih1.d("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j15 = iVar.N;
                j12 = -9223372036854775807L;
                if (j15 == -9223372036854775807L || c30Var.f88313h * 1000 > j15) {
                    iVar.M = 0;
                } else {
                    ih1.d("DashMediaSource", "Loaded stale dynamic manifest: " + c30Var.f88313h + ", " + iVar.N);
                }
            }
            int i11 = iVar.M;
            iVar.M = i11 + 1;
            if (i11 < iVar.f51042n.a(qb2Var.f93975c)) {
                iVar.D.postDelayed(iVar.f51050v, Math.min((iVar.M - 1) * 1000, 5000));
                return;
            } else {
                iVar.C = new f30();
                return;
            }
        }
        j12 = -9223372036854775807L;
        iVar.H = c30Var;
        iVar.I = c30Var.f88309d & iVar.I;
        iVar.J = j10 - j11;
        iVar.K = j10;
        synchronized (iVar.f51048t) {
            if (qb2Var.f93974b.f95522a == iVar.F) {
                Uri uri2 = iVar.H.f88316k;
                if (uri2 == null) {
                    uri2 = qb2Var.f93976d.f94279c;
                }
                iVar.F = uri2;
            }
        }
        if (size != 0) {
            iVar.O += i10;
            iVar.a(true);
            return;
        }
        c30 c30Var3 = iVar.H;
        if (!c30Var3.f88309d) {
            iVar.a(true);
            return;
        }
        hb3 hb3Var = c30Var3.f88314i;
        if (hb3Var == null) {
            iVar.g();
            return;
        }
        String str = hb3Var.f90352a;
        if (ib3.a(str, "urn:mpeg:dash:utc:direct:2014") || ib3.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                iVar.L = ib3.f(hb3Var.f90353b) - iVar.K;
                iVar.a(true);
                return;
            } catch (ob2 e10) {
                iVar.a(e10);
                return;
            }
        }
        if (ib3.a(str, "urn:mpeg:dash:utc:http-iso:2014") || ib3.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            qb2 qb2Var2 = new qb2(iVar.f51054z, Uri.parse(hb3Var.f90353b), 5, new d());
            iVar.A.a(qb2Var2, new g(iVar), 1);
            bn1 bn1Var2 = iVar.f51045q;
            Uri uri3 = qb2Var2.f93974b.f95522a;
            Collections.emptyMap();
            bn1Var2.c(new vf1(), new hm1(qb2Var2.f93975c, -1, null, 0, null, bn1Var2.a(j12), bn1Var2.a(j12)));
            return;
        }
        if (!ib3.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !ib3.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            if (ib3.a(str, "urn:mpeg:dash:utc:ntp:2014") || ib3.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                iVar.g();
                return;
            } else {
                iVar.a(new IOException("Unsupported UTC timing scheme"));
                return;
            }
        }
        qb2 qb2Var3 = new qb2(iVar.f51054z, Uri.parse(hb3Var.f90353b), 5, new h());
        iVar.A.a(qb2Var3, new g(iVar), 1);
        bn1 bn1Var3 = iVar.f51045q;
        Uri uri4 = qb2Var3.f93974b.f95522a;
        Collections.emptyMap();
        bn1Var3.c(new vf1(), new hm1(qb2Var3.f93975c, -1, null, 0, null, bn1Var3.a(j12), bn1Var3.a(j12)));
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11, boolean z10) {
        qb2 qb2Var = (qb2) bg1Var;
        i iVar = this.f51033b;
        iVar.getClass();
        long j12 = qb2Var.f93973a;
        Uri uri = qb2Var.f93976d.f94279c;
        vf1 vf1Var = new vf1();
        iVar.f51042n.getClass();
        bn1 bn1Var = iVar.f51045q;
        bn1Var.a(vf1Var, new hm1(qb2Var.f93975c, -1, null, 0, null, bn1Var.a(-9223372036854775807L), bn1Var.a(-9223372036854775807L)));
    }
}
