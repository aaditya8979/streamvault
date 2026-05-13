package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5245xm extends MessageNano {
    public static final int D = -1;
    public static final int E = 0;
    public static final int F = 1;
    public static volatile C5245xm[] G;
    public C5195vm A;
    public C5145tm[] B;
    public C5095rm C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f67961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f67962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f67963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f67964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f67965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f67966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f67967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C5071qm[] f67968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C5120sm f67969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f67970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f67971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f67972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f67973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f67974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f67975o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C5220wm f67976p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f67977q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f67978r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f67979s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f67980t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f67981u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C5170um f67982v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f67983w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f67984x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C5046pm f67985y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C5021om f67986z;

    public C5245xm() {
        a();
    }

    public static C5245xm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C5245xm) MessageNano.mergeFrom(new C5245xm(), bArr);
    }

    public static C5245xm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C5245xm().mergeFrom(codedInputByteBufferNano);
    }

    public static C5245xm[] b() {
        if (G == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (G == null) {
                    G = new C5245xm[0];
                }
            }
        }
        return G;
    }

    public final C5245xm a() {
        this.f67961a = "";
        this.f67962b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f67963c = strArr;
        this.f67964d = "";
        this.f67965e = "";
        this.f67966f = strArr;
        this.f67967g = strArr;
        this.f67968h = C5071qm.b();
        this.f67969i = null;
        this.f67970j = "";
        this.f67971k = "";
        this.f67972l = "";
        this.f67973m = false;
        this.f67974n = "";
        this.f67975o = strArr;
        this.f67976p = null;
        this.f67977q = false;
        this.f67978r = "";
        this.f67979s = 0L;
        this.f67980t = 0L;
        this.f67981u = false;
        this.f67982v = null;
        this.f67983w = 600;
        this.f67984x = 1;
        this.f67985y = null;
        this.f67986z = null;
        this.A = null;
        this.B = C5145tm.b();
        this.C = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5245xm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.f67961a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f67962b = codedInputByteBufferNano.readInt64();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f67963c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i10 = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i10];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i10 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f67963c = strArr2;
                    break;
                case 34:
                    this.f67964d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f67965e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f67966f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i11 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i11];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i11 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f67966f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f67967g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i12 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i12];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i12 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f67967g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C5071qm[] c5071qmArr = this.f67968h;
                    int length4 = c5071qmArr == null ? 0 : c5071qmArr.length;
                    int i13 = repeatedFieldArrayLength4 + length4;
                    C5071qm[] c5071qmArr2 = new C5071qm[i13];
                    if (length4 != 0) {
                        System.arraycopy(c5071qmArr, 0, c5071qmArr2, 0, length4);
                    }
                    while (length4 < i13 - 1) {
                        C5071qm c5071qm = new C5071qm();
                        c5071qmArr2[length4] = c5071qm;
                        codedInputByteBufferNano.readMessage(c5071qm);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C5071qm c5071qm2 = new C5071qm();
                    c5071qmArr2[length4] = c5071qm2;
                    codedInputByteBufferNano.readMessage(c5071qm2);
                    this.f67968h = c5071qmArr2;
                    break;
                case 74:
                    if (this.f67969i == null) {
                        this.f67969i = new C5120sm();
                    }
                    codedInputByteBufferNano.readMessage(this.f67969i);
                    break;
                case 82:
                    this.f67970j = codedInputByteBufferNano.readString();
                    break;
                case 90:
                    this.f67971k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f67972l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f67973m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f67974n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f67975o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i14 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i14];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i14 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f67975o = strArr8;
                    break;
                case 130:
                    if (this.f67976p == null) {
                        this.f67976p = new C5220wm();
                    }
                    codedInputByteBufferNano.readMessage(this.f67976p);
                    break;
                case 136:
                    this.f67977q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f67978r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f67979s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f67980t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f67981u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f67982v == null) {
                        this.f67982v = new C5170um();
                    }
                    codedInputByteBufferNano.readMessage(this.f67982v);
                    break;
                case 200:
                    this.f67983w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f67984x = codedInputByteBufferNano.readInt32();
                    break;
                case MRAID_JS_DOES_NOT_EXIST_VALUE:
                    if (this.f67985y == null) {
                        this.f67985y = new C5046pm();
                    }
                    codedInputByteBufferNano.readMessage(this.f67985y);
                    break;
                case 234:
                    if (this.f67986z == null) {
                        this.f67986z = new C5021om();
                    }
                    codedInputByteBufferNano.readMessage(this.f67986z);
                    break;
                case 242:
                    if (this.A == null) {
                        this.A = new C5195vm();
                    }
                    codedInputByteBufferNano.readMessage(this.A);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C5145tm[] c5145tmArr = this.B;
                    int length6 = c5145tmArr == null ? 0 : c5145tmArr.length;
                    int i15 = repeatedFieldArrayLength6 + length6;
                    C5145tm[] c5145tmArr2 = new C5145tm[i15];
                    if (length6 != 0) {
                        System.arraycopy(c5145tmArr, 0, c5145tmArr2, 0, length6);
                    }
                    while (length6 < i15 - 1) {
                        C5145tm c5145tm = new C5145tm();
                        c5145tmArr2[length6] = c5145tm;
                        codedInputByteBufferNano.readMessage(c5145tm);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C5145tm c5145tm2 = new C5145tm();
                    c5145tmArr2[length6] = c5145tm2;
                    codedInputByteBufferNano.readMessage(c5145tm2);
                    this.B = c5145tmArr2;
                    break;
                case 258:
                    if (this.C == null) {
                        this.C = new C5095rm();
                    }
                    codedInputByteBufferNano.readMessage(this.C);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f67961a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f67961a);
        }
        int iComputeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f67962b) + iComputeSerializedSize;
        String[] strArr = this.f67963c;
        int i10 = 0;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            int iComputeStringSizeNoTag = 0;
            int i12 = 0;
            while (true) {
                String[] strArr2 = this.f67963c;
                if (i11 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i11];
                if (str != null) {
                    i12++;
                    iComputeStringSizeNoTag += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i11++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag + i12;
        }
        if (!this.f67964d.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f67964d);
        }
        if (!this.f67965e.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f67965e);
        }
        String[] strArr3 = this.f67966f;
        if (strArr3 != null && strArr3.length > 0) {
            int i13 = 0;
            int iComputeStringSizeNoTag2 = 0;
            int i14 = 0;
            while (true) {
                String[] strArr4 = this.f67966f;
                if (i13 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i13];
                if (str2 != null) {
                    i14++;
                    iComputeStringSizeNoTag2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i13++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag2 + i14;
        }
        String[] strArr5 = this.f67967g;
        if (strArr5 != null && strArr5.length > 0) {
            int i15 = 0;
            int iComputeStringSizeNoTag3 = 0;
            int i16 = 0;
            while (true) {
                String[] strArr6 = this.f67967g;
                if (i15 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i15];
                if (str3 != null) {
                    i16++;
                    iComputeStringSizeNoTag3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i15++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag3 + i16;
        }
        C5071qm[] c5071qmArr = this.f67968h;
        if (c5071qmArr != null && c5071qmArr.length > 0) {
            int i17 = 0;
            while (true) {
                C5071qm[] c5071qmArr2 = this.f67968h;
                if (i17 >= c5071qmArr2.length) {
                    break;
                }
                C5071qm c5071qm = c5071qmArr2[i17];
                if (c5071qm != null) {
                    iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(8, c5071qm);
                }
                i17++;
            }
        }
        C5120sm c5120sm = this.f67969i;
        if (c5120sm != null) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c5120sm);
        }
        if (!this.f67970j.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f67970j);
        }
        if (!this.f67971k.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f67971k);
        }
        if (!this.f67972l.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f67972l);
        }
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f67973m) + iComputeInt64Size;
        if (!this.f67974n.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f67974n);
        }
        String[] strArr7 = this.f67975o;
        if (strArr7 != null && strArr7.length > 0) {
            int i18 = 0;
            int iComputeStringSizeNoTag4 = 0;
            int i19 = 0;
            while (true) {
                String[] strArr8 = this.f67975o;
                if (i18 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i18];
                if (str4 != null) {
                    i19++;
                    iComputeStringSizeNoTag4 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i18++;
            }
            iComputeBoolSize = iComputeBoolSize + iComputeStringSizeNoTag4 + i19;
        }
        C5220wm c5220wm = this.f67976p;
        if (c5220wm != null) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c5220wm);
        }
        boolean z10 = this.f67977q;
        if (z10) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z10);
        }
        if (!this.f67978r.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f67978r);
        }
        int iComputeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f67980t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f67979s) + iComputeBoolSize;
        boolean z11 = this.f67981u;
        if (z11) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z11);
        }
        C5170um c5170um = this.f67982v;
        if (c5170um != null) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c5170um);
        }
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f67984x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f67983w) + iComputeInt64Size2;
        C5046pm c5046pm = this.f67985y;
        if (c5046pm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c5046pm);
        }
        C5021om c5021om = this.f67986z;
        if (c5021om != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c5021om);
        }
        C5195vm c5195vm = this.A;
        if (c5195vm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c5195vm);
        }
        C5145tm[] c5145tmArr = this.B;
        if (c5145tmArr != null && c5145tmArr.length > 0) {
            while (true) {
                C5145tm[] c5145tmArr2 = this.B;
                if (i10 >= c5145tmArr2.length) {
                    break;
                }
                C5145tm c5145tm = c5145tmArr2[i10];
                if (c5145tm != null) {
                    iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(31, c5145tm);
                }
                i10++;
            }
        }
        C5095rm c5095rm = this.C;
        return c5095rm != null ? iComputeInt32Size + CodedOutputByteBufferNano.computeMessageSize(32, c5095rm) : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f67961a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f67961a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f67962b);
        String[] strArr = this.f67963c;
        int i10 = 0;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f67963c;
                if (i11 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i11];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i11++;
            }
        }
        if (!this.f67964d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f67964d);
        }
        if (!this.f67965e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f67965e);
        }
        String[] strArr3 = this.f67966f;
        if (strArr3 != null && strArr3.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr4 = this.f67966f;
                if (i12 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i12];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i12++;
            }
        }
        String[] strArr5 = this.f67967g;
        if (strArr5 != null && strArr5.length > 0) {
            int i13 = 0;
            while (true) {
                String[] strArr6 = this.f67967g;
                if (i13 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i13];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i13++;
            }
        }
        C5071qm[] c5071qmArr = this.f67968h;
        if (c5071qmArr != null && c5071qmArr.length > 0) {
            int i14 = 0;
            while (true) {
                C5071qm[] c5071qmArr2 = this.f67968h;
                if (i14 >= c5071qmArr2.length) {
                    break;
                }
                C5071qm c5071qm = c5071qmArr2[i14];
                if (c5071qm != null) {
                    codedOutputByteBufferNano.writeMessage(8, c5071qm);
                }
                i14++;
            }
        }
        C5120sm c5120sm = this.f67969i;
        if (c5120sm != null) {
            codedOutputByteBufferNano.writeMessage(9, c5120sm);
        }
        if (!this.f67970j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f67970j);
        }
        if (!this.f67971k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f67971k);
        }
        if (!this.f67972l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f67972l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f67973m);
        if (!this.f67974n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f67974n);
        }
        String[] strArr7 = this.f67975o;
        if (strArr7 != null && strArr7.length > 0) {
            int i15 = 0;
            while (true) {
                String[] strArr8 = this.f67975o;
                if (i15 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i15];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i15++;
            }
        }
        C5220wm c5220wm = this.f67976p;
        if (c5220wm != null) {
            codedOutputByteBufferNano.writeMessage(16, c5220wm);
        }
        boolean z10 = this.f67977q;
        if (z10) {
            codedOutputByteBufferNano.writeBool(17, z10);
        }
        if (!this.f67978r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f67978r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f67979s);
        codedOutputByteBufferNano.writeInt64(22, this.f67980t);
        boolean z11 = this.f67981u;
        if (z11) {
            codedOutputByteBufferNano.writeBool(23, z11);
        }
        C5170um c5170um = this.f67982v;
        if (c5170um != null) {
            codedOutputByteBufferNano.writeMessage(24, c5170um);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f67983w);
        codedOutputByteBufferNano.writeInt32(26, this.f67984x);
        C5046pm c5046pm = this.f67985y;
        if (c5046pm != null) {
            codedOutputByteBufferNano.writeMessage(27, c5046pm);
        }
        C5021om c5021om = this.f67986z;
        if (c5021om != null) {
            codedOutputByteBufferNano.writeMessage(29, c5021om);
        }
        C5195vm c5195vm = this.A;
        if (c5195vm != null) {
            codedOutputByteBufferNano.writeMessage(30, c5195vm);
        }
        C5145tm[] c5145tmArr = this.B;
        if (c5145tmArr != null && c5145tmArr.length > 0) {
            while (true) {
                C5145tm[] c5145tmArr2 = this.B;
                if (i10 >= c5145tmArr2.length) {
                    break;
                }
                C5145tm c5145tm = c5145tmArr2[i10];
                if (c5145tm != null) {
                    codedOutputByteBufferNano.writeMessage(31, c5145tm);
                }
                i10++;
            }
        }
        C5095rm c5095rm = this.C;
        if (c5095rm != null) {
            codedOutputByteBufferNano.writeMessage(32, c5095rm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
