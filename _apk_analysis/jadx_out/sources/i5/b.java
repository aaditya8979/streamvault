package i5;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: DashManifest.java */
/* JADX INFO: loaded from: classes7.dex */
public class b implements b5.d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f63736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f63737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f63738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f63739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f63740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f63741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f63742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f63743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final m f63744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final Uri f63745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final g f63746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<f> f63747l;

    public b(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, @Nullable g gVar, @Nullable m mVar, @Nullable Uri uri, List<f> list) {
        this.f63736a = j10;
        this.f63737b = j11;
        this.f63738c = j12;
        this.f63739d = z10;
        this.f63740e = j13;
        this.f63741f = j14;
        this.f63742g = j15;
        this.f63743h = j16;
        this.f63746k = gVar;
        this.f63744i = mVar;
        this.f63745j = uri;
        this.f63747l = list == null ? Collections.emptyList() : list;
    }

    public static ArrayList<a> b(List<a> list, LinkedList<StreamKey> linkedList) {
        StreamKey streamKeyPoll = linkedList.poll();
        int i10 = streamKeyPoll.f20358b;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i11 = streamKeyPoll.f20359c;
            a aVar = list.get(i11);
            List<i> list2 = aVar.f63732c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(streamKeyPoll.f20360d));
                streamKeyPoll = linkedList.poll();
                if (streamKeyPoll.f20358b != i10) {
                    break;
                }
            } while (streamKeyPoll.f20359c == i11);
            arrayList.add(new a(aVar.f63730a, aVar.f63731b, arrayList2, aVar.f63733d, aVar.f63734e, aVar.f63735f));
        } while (streamKeyPoll.f20358b == i10);
        linkedList.addFirst(streamKeyPoll);
        return arrayList;
    }

    @Override // b5.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b copy(List<StreamKey> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= d()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f20358b != i10) {
                long jE = e(i10);
                if (jE != -9223372036854775807L) {
                    j10 += jE;
                }
            } else {
                f fVarC = c(i10);
                arrayList.add(new f(fVarC.f63767a, fVarC.f63768b - j10, b(fVarC.f63769c, linkedList), fVarC.f63770d));
            }
            i10++;
        }
        long j11 = this.f63737b;
        return new b(this.f63736a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f63738c, this.f63739d, this.f63740e, this.f63741f, this.f63742g, this.f63743h, this.f63746k, this.f63744i, this.f63745j, arrayList);
    }

    public final f c(int i10) {
        return this.f63747l.get(i10);
    }

    public final int d() {
        return this.f63747l.size();
    }

    public final long e(int i10) {
        if (i10 != this.f63747l.size() - 1) {
            return this.f63747l.get(i10 + 1).f63768b - this.f63747l.get(i10).f63768b;
        }
        long j10 = this.f63737b;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - this.f63747l.get(i10).f63768b;
    }

    public final long f(int i10) {
        return e4.k.a(e(i10));
    }
}
