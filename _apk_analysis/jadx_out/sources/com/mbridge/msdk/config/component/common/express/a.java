package com.mbridge.msdk.config.component.common.express;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExpressionASTParser.java */
/* JADX INFO: loaded from: classes8.dex */
class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, Integer> f35780c = g.a(new Map.Entry[]{f.a("=", 0), f.a("+=", 0), f.a("-=", 0), f.a("*=", 0), f.a("/=", 0), f.a("%=", 0), f.a("or", 1), f.a("OR", 1), f.a("and", 2), f.a("AND", 2), f.a("==", 3), f.a("!=", 3), f.a(">", 4), f.a("<", 4), f.a(">=", 4), f.a("<=", 4), f.a(ScarConstants.IN_SIGNAL_KEY, 4), f.a("IN", 4), f.a("+", 5), f.a("-", 5), f.a("*", 6), f.a("/", 6), f.a("%", 6)});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f35781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35782b;

    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d dVar, int i10, boolean z10) {
        String str;
        Integer num;
        com.mbridge.msdk.config.component.common.express.node.d dVarC = c(dVar, z10);
        while (this.f35782b < this.f35781a.size() && (num = f35780c.get((str = this.f35781a.get(this.f35782b)))) != null && num.intValue() >= i10) {
            int i11 = this.f35782b + 1;
            this.f35782b = i11;
            if (i11 > this.f35781a.size() - 1) {
                break;
            }
            com.mbridge.msdk.config.component.common.express.node.d dVarA = a(dVar, num.intValue() + 1, z10);
            dVarC = str.matches("=|\\+=|-=|\\*=|/=|%=") ? new com.mbridge.msdk.config.component.common.express.node.b(str, dVarC, dVarA) : new com.mbridge.msdk.config.component.common.express.node.c(str, dVarC, dVarA);
        }
        return dVarC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ba, code lost:
    
        r13 = new com.mbridge.msdk.config.component.common.express.node.i(r4 + r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 1330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.a.a(com.mbridge.msdk.config.component.common.express.node.d, boolean):com.mbridge.msdk.config.component.common.express.node.d");
    }

    private com.mbridge.msdk.config.component.common.express.node.d b(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        return a(dVar, 0, z10);
    }

    private List<String> b(String str) {
        int i10;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\"') {
                sb2.append(cCharAt);
                z10 = !z10;
            } else if (z10) {
                sb2.append(cCharAt);
            } else if (Character.isWhitespace(cCharAt)) {
                if (sb2.length() > 0) {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
            } else if ("().,!><=|&+-*/%{}[]:".indexOf(cCharAt) >= 0) {
                if (sb2.length() > 0) {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
                if ((cCharAt == '!' || cCharAt == '=' || cCharAt == '>' || cCharAt == '<' || cCharAt == '+' || cCharAt == '-' || cCharAt == '*' || cCharAt == '/' || cCharAt == '%') && (i10 = i11 + 1) < length && str.charAt(i10) == '=') {
                    arrayList.add(cCharAt + "=");
                    i11 = i10;
                } else {
                    arrayList.add(String.valueOf(cCharAt));
                }
            } else {
                sb2.append(cCharAt);
            }
            i11++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    private com.mbridge.msdk.config.component.common.express.node.d c(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        if (!this.f35781a.get(this.f35782b).equals("(")) {
            return a(dVar, z10);
        }
        this.f35782b++;
        com.mbridge.msdk.config.component.common.express.node.d dVarB = b(dVar, true);
        int i10 = this.f35782b + 1;
        this.f35782b = i10;
        return i10 > this.f35781a.size() - 1 ? dVarB : b(dVarB, false);
    }

    public com.mbridge.msdk.config.component.common.express.node.d a(String str) {
        this.f35781a = b(str);
        this.f35782b = 0;
        return b(null, false);
    }
}
