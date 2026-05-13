package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;

/* JADX INFO: loaded from: classes6.dex */
public final class MetricsRequest$SDKInitFailureTrackingRequest extends GeneratedMessageLite<MetricsRequest$SDKInitFailureTrackingRequest, a> implements MessageLiteOrBuilder {
    public static final int CLIENT_ERROR_FIELD_NUMBER = 2;
    private static final MetricsRequest$SDKInitFailureTrackingRequest DEFAULT_INSTANCE;
    private static volatile Parser<MetricsRequest$SDKInitFailureTrackingRequest> PARSER = null;
    public static final int SERVER_ERROR_FIELD_NUMBER = 1;
    private int errorTypeCase_ = 0;
    private Object errorType_;

    public static final class ClientError extends GeneratedMessageLite<ClientError, a> implements MessageLiteOrBuilder {
        public static final int CLIENT_FAILURE_TYPE_FIELD_NUMBER = 1;
        private static final ClientError DEFAULT_INSTANCE;
        private static volatile Parser<ClientError> PARSER;
        private int bitField0_;
        private int clientFailureType_;

        public enum ClientErrorTypes implements Internal.EnumLite {
            UNKNOWN(0),
            HTTP_SSL_ERROR(1),
            HTTP_UKNOWN_HOST(2),
            HTTP_REQUEST_TIMEOUT(3),
            HTTP_SOCKET(4),
            ANDROID_WORK_MANAGER_ISSUE(5),
            UNRECOGNIZED(-1);

            public static final int ANDROID_WORK_MANAGER_ISSUE_VALUE = 5;
            public static final int HTTP_REQUEST_TIMEOUT_VALUE = 3;
            public static final int HTTP_SOCKET_VALUE = 4;
            public static final int HTTP_SSL_ERROR_VALUE = 1;
            public static final int HTTP_UKNOWN_HOST_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final Internal.EnumLiteMap<ClientErrorTypes> f45695b = new a();
            private final int value;

            public class a implements Internal.EnumLiteMap<ClientErrorTypes> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public ClientErrorTypes findValueByNumber(int i10) {
                    return ClientErrorTypes.forNumber(i10);
                }
            }

            public static final class b implements Internal.EnumVerifier {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Internal.EnumVerifier f45697a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public boolean isInRange(int i10) {
                    return ClientErrorTypes.forNumber(i10) != null;
                }
            }

            ClientErrorTypes(int i10) {
                this.value = i10;
            }

            public static ClientErrorTypes forNumber(int i10) {
                if (i10 == 0) {
                    return UNKNOWN;
                }
                if (i10 == 1) {
                    return HTTP_SSL_ERROR;
                }
                if (i10 == 2) {
                    return HTTP_UKNOWN_HOST;
                }
                if (i10 == 3) {
                    return HTTP_REQUEST_TIMEOUT;
                }
                if (i10 == 4) {
                    return HTTP_SOCKET;
                }
                if (i10 != 5) {
                    return null;
                }
                return ANDROID_WORK_MANAGER_ISSUE;
            }

            public static Internal.EnumLiteMap<ClientErrorTypes> internalGetValueMap() {
                return f45695b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f45697a;
            }

            @Deprecated
            public static ClientErrorTypes valueOf(int i10) {
                return forNumber(i10);
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        public static final class a extends GeneratedMessageLite.Builder<ClientError, a> implements MessageLiteOrBuilder {
            public a() {
                super(ClientError.DEFAULT_INSTANCE);
            }

            public a a(ClientErrorTypes clientErrorTypes) {
                copyOnWrite();
                ((ClientError) this.instance).d(clientErrorTypes);
                return this;
            }
        }

        static {
            ClientError clientError = new ClientError();
            DEFAULT_INSTANCE = clientError;
            GeneratedMessageLite.registerDefaultInstance(ClientError.class, clientError);
        }

        public static a c() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public final void d(ClientErrorTypes clientErrorTypes) {
            this.clientFailureType_ = clientErrorTypes.getNumber();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (z0.f51009a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ClientError();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "clientFailureType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ClientError> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ClientError.class) {
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

    public static final class a extends GeneratedMessageLite.Builder<MetricsRequest$SDKInitFailureTrackingRequest, a> implements MessageLiteOrBuilder {
        public a() {
            super(MetricsRequest$SDKInitFailureTrackingRequest.DEFAULT_INSTANCE);
        }

        public a a(ClientError clientError) {
            copyOnWrite();
            ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).e(clientError);
            return this;
        }

        public a b(b bVar) {
            copyOnWrite();
            ((MetricsRequest$SDKInitFailureTrackingRequest) this.instance).f(bVar);
            return this;
        }
    }

    public static final class b extends GeneratedMessageLite<b, a> implements MessageLiteOrBuilder {
        private static final b DEFAULT_INSTANCE;
        private static volatile Parser<b> PARSER = null;
        public static final int SERVER_HTTP_STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private int serverHttpStatus_;

        public static final class a extends GeneratedMessageLite.Builder<b, a> implements MessageLiteOrBuilder {
            public a() {
                super(b.DEFAULT_INSTANCE);
            }

            public a a(int i10) {
                copyOnWrite();
                ((b) this.instance).d(i10);
                return this;
            }
        }

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            GeneratedMessageLite.registerDefaultInstance(b.class, bVar);
        }

        public static a c() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public final void d(int i10) {
            this.bitField0_ |= 1;
            this.serverHttpStatus_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (z0.f51009a[methodToInvoke.ordinal()]) {
                case 1:
                    return new b();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"bitField0_", "serverHttpStatus_"});
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
        MetricsRequest$SDKInitFailureTrackingRequest metricsRequest$SDKInitFailureTrackingRequest = new MetricsRequest$SDKInitFailureTrackingRequest();
        DEFAULT_INSTANCE = metricsRequest$SDKInitFailureTrackingRequest;
        GeneratedMessageLite.registerDefaultInstance(MetricsRequest$SDKInitFailureTrackingRequest.class, metricsRequest$SDKInitFailureTrackingRequest);
    }

    public static a d() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (z0.f51009a[methodToInvoke.ordinal()]) {
            case 1:
                return new MetricsRequest$SDKInitFailureTrackingRequest();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"errorType_", "errorTypeCase_", b.class, ClientError.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MetricsRequest$SDKInitFailureTrackingRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MetricsRequest$SDKInitFailureTrackingRequest.class) {
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

    public final void e(ClientError clientError) {
        clientError.getClass();
        this.errorType_ = clientError;
        this.errorTypeCase_ = 2;
    }

    public final void f(b bVar) {
        bVar.getClass();
        this.errorType_ = bVar;
        this.errorTypeCase_ = 1;
    }
}
