package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: BidToken.java */
/* JADX INFO: loaded from: classes8.dex */
public final class h extends GeneratedMessageLite<h, a> implements MessageLiteOrBuilder {
    private static final h DEFAULT_INSTANCE;
    public static final int ES_FIELD_NUMBER = 1;
    private static volatile Parser<h> PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 2;
    private ByteString es_;
    private ByteString payload_;

    /* JADX INFO: compiled from: BidToken.java */
    public static final class a extends GeneratedMessageLite.Builder<h, a> implements MessageLiteOrBuilder {
        public a() {
            super(h.DEFAULT_INSTANCE);
        }

        public a a(ByteString byteString) {
            copyOnWrite();
            ((h) this.instance).e(byteString);
            return this;
        }

        public a b(ByteString byteString) {
            copyOnWrite();
            ((h) this.instance).f(byteString);
            return this;
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        GeneratedMessageLite.registerDefaultInstance(h.class, hVar);
    }

    public h() {
        ByteString byteString = ByteString.EMPTY;
        this.es_ = byteString;
        this.payload_ = byteString;
    }

    public static a d() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.moloco.sdk.a.f45707a[methodToInvoke.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"es_", "payload_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<h> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (h.class) {
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

    public final void e(ByteString byteString) {
        byteString.getClass();
        this.es_ = byteString;
    }

    public final void f(ByteString byteString) {
        byteString.getClass();
        this.payload_ = byteString;
    }
}
