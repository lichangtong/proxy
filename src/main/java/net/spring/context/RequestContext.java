package net.spring.context;

public final class RequestContext {
    private static ThreadLocal<RequestContext.RequestLocal> requestLocalContext = new ThreadLocal();

    public static void initContext() {
        RequestLocal requestLocal = new RequestLocal();
        requestLocal.setAdapterParam("abcdefg");
        requestLocalContext.set(requestLocal);
    }

    public static Object getAdapterParam() {
        return requestLocalContext.get().getAdapterParam();
    }
    public static void setAdapterParam(Object object){
        requestLocalContext.get().setAdapterParam(object);
    }
    private static class RequestLocal {
        private Object adapterParam;
        private Object serviceParam;

        public Object getAdapterParam() {
            return adapterParam;
        }

        public void setAdapterParam(Object adapterParam) {
            this.adapterParam = adapterParam;
        }

        public Object getServiceParam() {
            return serviceParam;
        }

        public void setServiceParam(Object serviceParam) {
            this.serviceParam = serviceParam;
        }
    }
}
