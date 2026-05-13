package com.moloco.sdk;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.util.List;

/* JADX INFO: compiled from: IlrdRequest.java */
/* JADX INFO: loaded from: classes12.dex */
public final class i0 extends GeneratedMessageLite<i0, a> implements MessageLiteOrBuilder {
    private static final i0 DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int EVENTS_FIELD_NUMBER = 6;
    public static final int IDFV_FIELD_NUMBER = 2;
    public static final int OS_FIELD_NUMBER = 3;
    private static volatile Parser<i0> PARSER = null;
    public static final int PUBLISHER_APP_ID_FIELD_NUMBER = 5;
    public static final int PUBLISHER_ID_FIELD_NUMBER = 4;
    private String deviceId_ = "";
    private String idfv_ = "";
    private String os_ = "";
    private String publisherId_ = "";
    private String publisherAppId_ = "";
    private Internal.ProtobufList<g0> events_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: IlrdRequest.java */
    public static final class a extends GeneratedMessageLite.Builder<i0, a> implements MessageLiteOrBuilder {
        public a() {
            super(i0.DEFAULT_INSTANCE);
        }

        public a a(Iterable<? extends g0> iterable) {
            copyOnWrite();
            ((i0) this.instance).g(iterable);
            return this;
        }

        public a b(String str) {
            copyOnWrite();
            ((i0) this.instance).l(str);
            return this;
        }

        public a c(String str) {
            copyOnWrite();
            ((i0) this.instance).setOs(str);
            return this;
        }

        public a d(String str) {
            copyOnWrite();
            ((i0) this.instance).m(str);
            return this;
        }

        public a e(String str) {
            copyOnWrite();
            ((i0) this.instance).n(str);
            return this;
        }
    }

    static {
        i0 i0Var = new i0();
        DEFAULT_INSTANCE = i0Var;
        GeneratedMessageLite.registerDefaultInstance(i0.class, i0Var);
    }

    public static a j() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static i0 k(byte[] bArr) throws InvalidProtocolBufferException {
        return (i0) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (e0.f45906a[methodToInvoke.ordinal()]) {
            case 1:
                return new i0();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"deviceId_", "idfv_", "os_", "publisherId_", "publisherAppId_", "events_", g0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<i0> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (i0.class) {
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

    public final void g(Iterable<? extends g0> iterable) {
        h();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.events_);
    }

    public final void h() {
        Internal.ProtobufList<g0> protobufList = this.events_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.events_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public List<g0> i() {
        return this.events_;
    }

    public final void l(String str) {
        str.getClass();
        this.deviceId_ = str;
    }

    public final void m(String str) {
        str.getClass();
        this.publisherAppId_ = str;
    }

    public final void n(String str) {
        str.getClass();
        this.publisherId_ = str;
    }

    public final void setOs(String str) {
        str.getClass();
        this.os_ = str;
    }
}
