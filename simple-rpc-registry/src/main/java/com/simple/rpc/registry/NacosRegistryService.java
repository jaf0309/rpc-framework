package com.simple.rpc.registry;


import com.simple.rpc.common.ServiceMeta;

public class NacosRegistryService implements RegistryService {

    public NacosRegistryService(String registryAddr) {

    }

    @Override
    public void register(ServiceMeta serviceMeta) {


    }

    @Override
    public void unRegister(ServiceMeta serviceMeta) {

    }

    @Override
    public ServiceMeta discovery(String serviceName, int invokerHashCode) {
        return null;
    }

    @Override
    public void destroy() {

    }
}