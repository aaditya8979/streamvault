package com.ironsource;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4075ib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f31950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31951b;

    public C4075ib(@Nullable String str, int i10) {
        this.f31950a = str;
        this.f31951b = i10;
    }

    private final String a(StackTraceElement[] stackTraceElementArr, int i10) {
        List listM;
        List listM2;
        if (stackTraceElementArr.length <= i10) {
            return "";
        }
        String className = stackTraceElementArr[i10].getClassName();
        tn.p.j(className, "stackTrace[depth]\n              .className");
        List<String> listSplit = new Regex("\\.").split(className, 0);
        if (listSplit.isEmpty()) {
            listM = cn.w.m();
        } else {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    listM = cn.f0.Y0(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listM = cn.w.m();
        }
        String str = ((String[]) listM.toArray(new String[0]))[r4.length - 1];
        if (!bo.d0.c0(str, "$", false, 2, null)) {
            return str;
        }
        List<String> listSplit2 = new Regex("\\$").split(str, 0);
        if (listSplit2.isEmpty()) {
            listM2 = cn.w.m();
        } else {
            ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
            while (listIterator2.hasPrevious()) {
                if (listIterator2.previous().length() != 0) {
                    listM2 = cn.f0.Y0(listSplit2, listIterator2.nextIndex() + 1);
                    break;
                }
            }
            listM2 = cn.w.m();
        }
        return ((String[]) listM2.toArray(new String[0]))[0];
    }

    private final String b() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        tn.p.j(stackTrace, "stackTrace");
        String strA = a(stackTrace, 4);
        String strB = b(stackTrace, 4);
        tn.x xVar = tn.x.f85368a;
        String str = String.format("%s %s", Arrays.copyOf(new Object[]{strA, strB}, 2));
        tn.p.j(str, "format(format, *args)");
        return str;
    }

    private final String b(StackTraceElement[] stackTraceElementArr, int i10) {
        List listM;
        int i11;
        List listM2;
        List listM3;
        if (stackTraceElementArr.length <= i10) {
            return "";
        }
        String className = stackTraceElementArr[i10].getClassName();
        tn.p.j(className, "stackTrace[depth]\n              .className");
        List<String> listSplit = new Regex("\\.").split(className, 0);
        if (listSplit.isEmpty()) {
            listM = cn.w.m();
        } else {
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    listM = cn.f0.Y0(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
            listM = cn.w.m();
        }
        String[] strArr = (String[]) listM.toArray(new String[0]);
        String str = strArr[strArr.length - 1];
        if (bo.d0.c0(str, "$", false, 2, null)) {
            List<String> listSplit2 = new Regex("\\$").split(str, 0);
            if (listSplit2.isEmpty()) {
                listM3 = cn.w.m();
            } else {
                ListIterator<String> listIterator2 = listSplit2.listIterator(listSplit2.size());
                while (listIterator2.hasPrevious()) {
                    if (listIterator2.previous().length() != 0) {
                        listM3 = cn.f0.Y0(listSplit2, listIterator2.nextIndex() + 1);
                        break;
                    }
                }
                listM3 = cn.w.m();
            }
            return ((String[]) listM3.toArray(new String[0]))[1] + "." + stackTraceElementArr[i10].getMethodName();
        }
        String methodName = stackTraceElementArr[i10].getMethodName();
        tn.p.j(methodName, "stackTrace[depth].methodName");
        if (!bo.d0.c0(methodName, "$", false, 2, null) || stackTraceElementArr.length <= (i11 = i10 + 1)) {
            String methodName2 = stackTraceElementArr[i10].getMethodName();
            tn.p.j(methodName2, "stackTrace[depth].methodName");
            return methodName2;
        }
        String className2 = stackTraceElementArr[i11].getClassName();
        tn.p.j(className2, "stackTrace[depth + 1]\n                .className");
        List<String> listSplit3 = new Regex("\\$").split(className2, 0);
        if (listSplit3.isEmpty()) {
            listM2 = cn.w.m();
        } else {
            ListIterator<String> listIterator3 = listSplit3.listIterator(listSplit3.size());
            while (listIterator3.hasPrevious()) {
                if (listIterator3.previous().length() != 0) {
                    listM2 = cn.f0.Y0(listSplit3, listIterator3.nextIndex() + 1);
                    break;
                }
            }
            listM2 = cn.w.m();
        }
        String[] strArr2 = (String[]) listM2.toArray(new String[0]);
        if (strArr2.length <= 1) {
            String methodName3 = stackTraceElementArr[i11].getMethodName();
            tn.p.j(methodName3, "{\n              stackTra….methodName\n            }");
            return methodName3;
        }
        return strArr2[1] + "." + stackTraceElementArr[i11].getMethodName();
    }

    public final int a() {
        return this.f31951b;
    }

    @NotNull
    public final String c() {
        String str = this.f31950a;
        if (str == null || str.length() == 0) {
            return b();
        }
        return b() + " - " + this.f31950a;
    }
}
