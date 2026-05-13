package q7;

import com.google.android.exoplayer2.d0;
import com.google.common.collect.ImmutableList;
import e7.g0;
import e7.i0;
import java.util.Arrays;
import java.util.List;
import q7.t;

/* JADX INFO: compiled from: TrackSelectionUtil.java */
/* JADX INFO: loaded from: classes12.dex */
public final class z {
    public static d0 a(t.a aVar, List<? extends u>[] listArr) {
        boolean z10;
        ImmutableList.a aVar2 = new ImmutableList.a();
        for (int i10 = 0; i10 < aVar.d(); i10++) {
            i0 i0VarF = aVar.f(i10);
            List<? extends u> list = listArr[i10];
            for (int i11 = 0; i11 < i0VarF.f60877b; i11++) {
                g0 g0VarB = i0VarF.b(i11);
                boolean z11 = aVar.a(i10, i11, false) != 0;
                int i12 = g0VarB.f60866b;
                int[] iArr = new int[i12];
                boolean[] zArr = new boolean[i12];
                for (int i13 = 0; i13 < g0VarB.f60866b; i13++) {
                    iArr[i13] = aVar.g(i10, i11, i13);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        u uVar = list.get(i14);
                        if (uVar.getTrackGroup().equals(g0VarB) && uVar.indexOf(i13) != -1) {
                            z10 = true;
                            break;
                        }
                        i14++;
                    }
                    zArr[i13] = z10;
                }
                aVar2.a(new d0.a(g0VarB, z11, iArr, zArr));
            }
        }
        i0 i0VarH = aVar.h();
        for (int i15 = 0; i15 < i0VarH.f60877b; i15++) {
            g0 g0VarB2 = i0VarH.b(i15);
            int[] iArr2 = new int[g0VarB2.f60866b];
            Arrays.fill(iArr2, 0);
            aVar2.a(new d0.a(g0VarB2, false, iArr2, new boolean[g0VarB2.f60866b]));
        }
        return new d0(aVar2.m());
    }

    public static d0 b(t.a aVar, u[] uVarArr) {
        List[] listArr = new List[uVarArr.length];
        for (int i10 = 0; i10 < uVarArr.length; i10++) {
            u uVar = uVarArr[i10];
            listArr[i10] = uVar != null ? ImmutableList.of(uVar) : ImmutableList.of();
        }
        return a(aVar, listArr);
    }
}
