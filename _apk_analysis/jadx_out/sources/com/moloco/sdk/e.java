package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: BidToken.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends GeneratedMessageLite<e, a> implements MessageLiteOrBuilder {
    public static final int BID_TOKEN_FIELD_NUMBER = 1;
    public static final int CLIENT_TOKEN_CONFIGS_FIELD_NUMBER = 3;
    private static final e DEFAULT_INSTANCE;
    private static volatile Parser<e> PARSER = null;
    public static final int PK_FIELD_NUMBER = 2;
    private b clientTokenConfigs_;
    private String bidToken_ = "";
    private String pk_ = "";

    /* JADX INFO: compiled from: BidToken.java */
    public static final class a extends GeneratedMessageLite.Builder<e, a> implements MessageLiteOrBuilder {
        public a() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: BidToken.java */
    public static final class b extends GeneratedMessageLite<b, a> implements MessageLiteOrBuilder {
        private static final b DEFAULT_INSTANCE;
        public static final int ENABLE_DBT_FIELD_NUMBER = 1;
        private static volatile Parser<b> PARSER;
        private boolean enableDbt_;

        /* JADX INFO: compiled from: BidToken.java */
        public static final class a extends GeneratedMessageLite.Builder<b, a> implements MessageLiteOrBuilder {
            public a() {
                super(b.DEFAULT_INSTANCE);
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
        }

        public static b b() {
            return DEFAULT_INSTANCE;
        }

        public boolean c() {
            return this.enableDbt_;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"enableDbt_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<b> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (b.class) {
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
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        GeneratedMessageLite.registerDefaultInstance(e.class, eVar);
    }

    public static e f(byte[] bArr) throws InvalidProtocolBufferException {
        return (e) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public String b() {
        return this.bidToken_;
    }

    public b c() {
        b bVar = this.clientTokenConfigs_;
        return bVar == null ? b.b() : bVar;
    }

    public String d() {
        return this.pk_;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\t", new Object[]{"bidToken_", "pk_", "clientTokenConfigs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<e> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (e.class) {
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

    public boolean e() {
        return this.clientTokenConfigs_ != null;
    }
}
