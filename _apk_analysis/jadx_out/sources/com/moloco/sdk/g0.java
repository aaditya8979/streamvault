package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: compiled from: IlrdRequest.java */
/* JADX INFO: loaded from: classes12.dex */
public final class g0 extends GeneratedMessageLite<g0, a> implements MessageLiteOrBuilder {
    private static final g0 DEFAULT_INSTANCE;
    public static final int EVENT_ID_FIELD_NUMBER = 2;
    public static final int LEVELPLAY_FIELD_NUMBER = 4;
    public static final int MAX_FIELD_NUMBER = 3;
    private static volatile Parser<g0> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private Object platform_;
    private int platformCase_ = 0;
    private String sessionId_ = "";
    private String eventId_ = "";

    /* JADX INFO: compiled from: IlrdRequest.java */
    public static final class a extends GeneratedMessageLite.Builder<g0, a> implements MessageLiteOrBuilder {
        public a() {
            super(g0.DEFAULT_INSTANCE);
        }

        public a a(String str) {
            copyOnWrite();
            ((g0) this.instance).setEventId(str);
            return this;
        }

        public a b(k0 k0Var) {
            copyOnWrite();
            ((g0) this.instance).g(k0Var);
            return this;
        }

        public a c(m0 m0Var) {
            copyOnWrite();
            ((g0) this.instance).h(m0Var);
            return this;
        }

        public a d(String str) {
            copyOnWrite();
            ((g0) this.instance).setSessionId(str);
            return this;
        }
    }

    static {
        g0 g0Var = new g0();
        DEFAULT_INSTANCE = g0Var;
        GeneratedMessageLite.registerDefaultInstance(g0.class, g0Var);
    }

    public static a f() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (e0.f45906a[methodToInvoke.ordinal()]) {
            case 1:
                return new g0();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003<\u0000\u0004<\u0000", new Object[]{"platform_", "platformCase_", "sessionId_", "eventId_", m0.class, k0.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<g0> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (g0.class) {
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

    public final void g(k0 k0Var) {
        k0Var.getClass();
        this.platform_ = k0Var;
        this.platformCase_ = 4;
    }

    public String getEventId() {
        return this.eventId_;
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public final void h(m0 m0Var) {
        m0Var.getClass();
        this.platform_ = m0Var;
        this.platformCase_ = 3;
    }

    public final void setEventId(String str) {
        str.getClass();
        this.eventId_ = str;
    }

    public final void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }
}
