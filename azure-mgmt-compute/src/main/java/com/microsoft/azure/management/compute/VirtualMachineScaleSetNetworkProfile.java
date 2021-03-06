/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import java.util.List;

/**
 * Describes a virtual machine scale set network profile.
 */
public class VirtualMachineScaleSetNetworkProfile {
    /**
     * Gets or sets the list of network configurations.
     */
    private List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations;

    /**
     * Get the networkInterfaceConfigurations value.
     *
     * @return the networkInterfaceConfigurations value
     */
    public List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations() {
        return this.networkInterfaceConfigurations;
    }

    /**
     * Set the networkInterfaceConfigurations value.
     *
     * @param networkInterfaceConfigurations the networkInterfaceConfigurations value to set
     * @return the VirtualMachineScaleSetNetworkProfile object itself.
     */
    public VirtualMachineScaleSetNetworkProfile withNetworkInterfaceConfigurations(List<VirtualMachineScaleSetNetworkConfiguration> networkInterfaceConfigurations) {
        this.networkInterfaceConfigurations = networkInterfaceConfigurations;
        return this;
    }

}
