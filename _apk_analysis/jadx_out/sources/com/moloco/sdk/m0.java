package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: IlrdRequest.java */
/* JADX INFO: loaded from: classes10.dex */
public final class m0 extends GeneratedMessageLite<m0, a> implements MessageLiteOrBuilder {
    public static final int AD_FORMAT_FIELD_NUMBER = 1;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 2;
    private static final m0 DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 3;
    public static final int MAX_AD_UNIT_ID_FIELD_NUMBER = 4;
    public static final int NETWORK_NAME_FIELD_NUMBER = 5;
    private static volatile Parser<m0> PARSER = null;
    public static final int REVENUE_FIELD_NUMBER = 6;
    public static final int THIRD_PARTY_AD_PLACEMENT_ID_FIELD_NUMBER = 7;
    public static final int USER_SEGMENT_FIELD_NUMBER = 8;
    private double revenue_;
    private String adFormat_ = "";
    private String countryCode_ = "";
    private String id_ = "";
    private String maxAdUnitId_ = "";
    private String networkName_ = "";
    private String thirdPartyAdPlacementId_ = "";
    private String userSegment_ = "";

    /* JADX INFO: compiled from: IlrdRequest.java */
    public static final class a extends GeneratedMessageLite.Builder<m0, a> implements MessageLiteOrBuilder {
        public a() {
            super(m0.DEFAULT_INSTANCE);
        }

        public a a(String str) {
            copyOnWrite();
            ((m0) this.instance).l(str);
            return this;
        }

        public a b(String str) {
            copyOnWrite();
            ((m0) this.instance).m(str);
            return this;
        }

        public a c(String str) {
            copyOnWrite();
            ((m0) this.instance).n(str);
            return this;
        }

        public a d(String str) {
            copyOnWrite();
            ((m0) this.instance).o(str);
            return this;
        }

        public a e(String str) {
            copyOnWrite();
            ((m0) this.instance).p(str);
            return this;
        }

        public a f(double d10) {
            copyOnWrite();
            ((m0) this.instance).q(d10);
            return this;
        }

        public a g(String str) {
            copyOnWrite();
            ((m0) this.instance).r(str);
            return this;
        }

        public a h(String str) {
            copyOnWrite();
            ((m0) this.instance).s(str);
            return this;
        }
    }

    static {
        m0 m0Var = new m0();
        DEFAULT_INSTANCE = m0Var;
        GeneratedMessageLite.registerDefaultInstance(m0.class, m0Var);
    }

    public static a k() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (e0.f45906a[methodToInvoke.ordinal()]) {
            case 1:
                return new m0();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u0000\u0007Ȉ\bȈ", new Object[]{"adFormat_", "countryCode_", "id_", "maxAdUnitId_", "networkName_", "revenue_", "thirdPartyAdPlacementId_", "userSegment_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<m0> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (m0.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String j() {
        return this.adFormat_;
    }

    public final void l(String str) {
        str.getClass();
        this.adFormat_ = str;
    }

    public final void m(String str) {
        str.getClass();
        this.countryCode_ = str;
    }

    public final void n(String str) {
        str.getClass();
        this.id_ = str;
    }

    public final void o(String str) {
        str.getClass();
        this.maxAdUnitId_ = str;
    }

    public final void p(String str) {
        str.getClass();
        this.networkName_ = str;
    }

    public final void q(double d10) {
        this.revenue_ = d10;
    }

    public final void r(String str) {
        str.getClass();
        this.thirdPartyAdPlacementId_ = str;
    }

    public final void s(String str) {
        str.getClass();
        this.userSegment_ = str;
    }
}
