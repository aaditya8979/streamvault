package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class dp3 implements to2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to2 f88954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ep3 f88955b;

    public dp3(gp3 gp3Var, ep3 ep3Var) {
        this.f88954a = gp3Var;
        this.f88955b = ep3Var;
    }

    @Override // yads.to2
    public final void a(be3 be3Var) {
        this.f88954a.a(be3Var);
    }

    @Override // yads.to2
    public final void onSuccess(Object obj) {
        List listY0 = (List) obj;
        ep3 ep3Var = this.f88955b;
        ip3 ip3Var = ep3Var.f89346a.f91705a.f95614m;
        if (ip3Var != null) {
            if (!ip3Var.f90950b) {
                ep3Var.f89347b.getClass();
                listY0 = pg3.a(listY0).f93217a;
            }
            if (!ip3Var.f90949a) {
                listY0 = cn.f0.Y0(listY0, 1);
            }
            zo3 zo3Var = ep3Var.f89348c;
            zo3Var.getClass();
            int i10 = 10;
            ArrayList arrayList = new ArrayList(cn.x.x(listY0, 10));
            Iterator it = listY0.iterator();
            while (it.hasNext()) {
                ud3 ud3Var = (ud3) it.next();
                xo3 xo3Var = zo3Var.f97736b;
                List list = xo3Var.f96845a.f95603b;
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    cn.b0.F(arrayList2, ((b20) it2.next()).f87883d);
                }
                List list2 = ud3Var.f95603b;
                ArrayList arrayList3 = new ArrayList(cn.x.x(list2, i10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    b20 b20Var = (b20) it3.next();
                    xo3Var.f96846b.getClass();
                    List list3 = b20Var.f87882c;
                    ArrayList arrayList4 = new ArrayList(cn.x.x(list3, i10));
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(((j21) it4.next()).f91082a);
                    }
                    Set setK1 = cn.f0.k1(arrayList4);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        cn.b0.F(arrayList5, ((b20) it5.next()).f87882c);
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : arrayList5) {
                        if (setK1.add(((j21) obj2).f91082a)) {
                            arrayList6.add(obj2);
                        }
                    }
                    List listM = b20Var.f87883d;
                    List listO0 = cn.f0.O0(b20Var.f87880a, b20Var.f87881b);
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it6 = it;
                    ArrayList arrayList9 = new ArrayList();
                    xo3 xo3Var2 = xo3Var;
                    String str = b20Var.f87887h;
                    if (listO0 == null) {
                        listO0 = cn.w.m();
                    }
                    arrayList7.addAll(listO0);
                    List listM2 = b20Var.f87882c;
                    if (listM2 == null) {
                        listM2 = cn.w.m();
                    }
                    arrayList8.addAll(listM2);
                    arrayList9.addAll(arrayList2);
                    String str2 = b20Var.f87885f;
                    List list4 = list;
                    n03 n03Var = b20Var.f87886g;
                    ArrayList arrayList10 = arrayList2;
                    int i11 = b20Var.f87888i;
                    arrayList8.addAll(arrayList6);
                    if (listM == null) {
                        listM = cn.w.m();
                    }
                    arrayList9.addAll(listM);
                    String str3 = b20Var.f87889j;
                    ArrayList arrayList11 = new ArrayList();
                    Iterator it7 = arrayList7.iterator();
                    while (it7.hasNext()) {
                        Iterator it8 = it3;
                        Object next = it7.next();
                        Iterator it9 = it7;
                        if (next instanceof kl1) {
                            arrayList11.add(next);
                        }
                        it7 = it9;
                        it3 = it8;
                    }
                    Iterator it10 = it3;
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it11 = arrayList7.iterator();
                    while (it11.hasNext()) {
                        Object next2 = it11.next();
                        Iterator it12 = it11;
                        if (next2 instanceof rc1) {
                            arrayList12.add(next2);
                        }
                        it11 = it12;
                    }
                    arrayList3.add(new b20(arrayList11, arrayList12, arrayList8, arrayList9, null, str2, n03Var, str, i11, str3));
                    it = it6;
                    xo3Var = xo3Var2;
                    list = list4;
                    arrayList2 = arrayList10;
                    it3 = it10;
                    i10 = 10;
                }
                Iterator it13 = it;
                yo3 yo3Var = zo3Var.f97737c;
                ud3 ud3Var2 = zo3Var.f97735a;
                yo3Var.getClass();
                de3 de3Var = ud3Var.f95605d;
                de3 de3Var2 = ud3Var2.f95605d;
                de3 de3Var3 = new de3(cn.f0.O0(de3Var.f88838a, de3Var2.f88838a), cn.f0.O0(de3Var.f88839b, de3Var2.f88839b));
                ap3 ap3Var = zo3Var.f97738d;
                ud3 ud3Var3 = zo3Var.f97735a;
                ap3Var.getClass();
                List listP = cn.w.p(ud3Var, ud3Var3);
                ArrayList arrayList13 = new ArrayList();
                Iterator it14 = listP.iterator();
                while (it14.hasNext()) {
                    ol3 ol3Var = ((ud3) it14.next()).f95611j;
                    List listM3 = ol3Var != null ? ol3Var.f93280a : null;
                    if (listM3 == null) {
                        listM3 = cn.w.m();
                    }
                    cn.b0.F(arrayList13, listM3);
                }
                ol3 ol3Var2 = new ol3(arrayList13);
                Map map = ud3Var.f95604c;
                ud3 ud3Var4 = zo3Var.f97735a;
                Map map2 = ud3Var4.f95604c;
                List listO02 = cn.f0.O0(ud3Var.f95615n, ud3Var4.f95615n);
                td3 td3Var = new td3(ud3Var.f95602a, new kg3(zo3Var.f97739e));
                td3Var.f95174k = ud3Var.f95613l;
                td3Var.f95175l.addAll(arrayList3);
                td3 td3VarA = td3Var.a(map);
                td3VarA.f95167d = ud3Var.f95606e;
                td3VarA.f95168e = ud3Var.f95607f;
                td3VarA.f95169f = ud3Var.f95608g;
                td3VarA.f95170g = ud3Var.f95609h;
                td3VarA.f95171h = ud3Var.f95610i;
                td3VarA.f95178o = de3Var3;
                td3VarA.f95172i = ol3Var2;
                td3VarA.f95166c = ud3Var.f95614m;
                td3 td3VarA2 = td3VarA.a(map2);
                ArrayList arrayList14 = td3VarA2.f95176m;
                if (listO02 == null) {
                    listO02 = cn.w.m();
                }
                arrayList14.addAll(listO02);
                arrayList.add(td3VarA2.a());
                it = it13;
                i10 = 10;
            }
            listY0 = arrayList;
        }
        this.f88954a.onSuccess(listY0);
    }
}
