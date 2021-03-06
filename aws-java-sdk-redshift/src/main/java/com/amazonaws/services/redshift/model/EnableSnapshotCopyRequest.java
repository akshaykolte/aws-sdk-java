/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * </p>
 */
public class EnableSnapshotCopyRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the source cluster to copy snapshots from.
     * </p>
     * <p>
     * Constraints: Must be the valid name of an existing cluster that does not
     * already have cross-region snapshot copy enabled.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The destination region that you want to copy snapshots to.
     * </p>
     * <p>
     * Constraints: Must be the name of a valid region. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region"
     * >Regions and Endpoints</a> in the Amazon Web Services General Reference.
     * </p>
     */
    private String destinationRegion;
    /**
     * <p>
     * The number of days to retain automated snapshots in the destination
     * region after they are copied from the source region.
     * </p>
     * <p>
     * Default: 7.
     * </p>
     * <p>
     * Constraints: Must be at least 1 and no more than 35.
     * </p>
     */
    private Integer retentionPeriod;
    /**
     * <p>
     * The name of the snapshot copy grant to use when snapshots of an AWS
     * KMS-encrypted cluster are copied to the destination region.
     * </p>
     */
    private String snapshotCopyGrantName;

    /**
     * <p>
     * The unique identifier of the source cluster to copy snapshots from.
     * </p>
     * <p>
     * Constraints: Must be the valid name of an existing cluster that does not
     * already have cross-region snapshot copy enabled.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the source cluster to copy snapshots
     *        from. </p>
     *        <p>
     *        Constraints: Must be the valid name of an existing cluster that
     *        does not already have cross-region snapshot copy enabled.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the source cluster to copy snapshots from.
     * </p>
     * <p>
     * Constraints: Must be the valid name of an existing cluster that does not
     * already have cross-region snapshot copy enabled.
     * </p>
     * 
     * @return The unique identifier of the source cluster to copy snapshots
     *         from. </p>
     *         <p>
     *         Constraints: Must be the valid name of an existing cluster that
     *         does not already have cross-region snapshot copy enabled.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of the source cluster to copy snapshots from.
     * </p>
     * <p>
     * Constraints: Must be the valid name of an existing cluster that does not
     * already have cross-region snapshot copy enabled.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier of the source cluster to copy snapshots
     *        from. </p>
     *        <p>
     *        Constraints: Must be the valid name of an existing cluster that
     *        does not already have cross-region snapshot copy enabled.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EnableSnapshotCopyRequest withClusterIdentifier(
            String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The destination region that you want to copy snapshots to.
     * </p>
     * <p>
     * Constraints: Must be the name of a valid region. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region"
     * >Regions and Endpoints</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param destinationRegion
     *        The destination region that you want to copy snapshots to. </p>
     *        <p>
     *        Constraints: Must be the name of a valid region. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region"
     *        >Regions and Endpoints</a> in the Amazon Web Services General
     *        Reference.
     */

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    /**
     * <p>
     * The destination region that you want to copy snapshots to.
     * </p>
     * <p>
     * Constraints: Must be the name of a valid region. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region"
     * >Regions and Endpoints</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @return The destination region that you want to copy snapshots to. </p>
     *         <p>
     *         Constraints: Must be the name of a valid region. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region"
     *         >Regions and Endpoints</a> in the Amazon Web Services General
     *         Reference.
     */

    public String getDestinationRegion() {
        return this.destinationRegion;
    }

    /**
     * <p>
     * The destination region that you want to copy snapshots to.
     * </p>
     * <p>
     * Constraints: Must be the name of a valid region. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region"
     * >Regions and Endpoints</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param destinationRegion
     *        The destination region that you want to copy snapshots to. </p>
     *        <p>
     *        Constraints: Must be the name of a valid region. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/rande.html#redshift_region"
     *        >Regions and Endpoints</a> in the Amazon Web Services General
     *        Reference.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EnableSnapshotCopyRequest withDestinationRegion(
            String destinationRegion) {
        setDestinationRegion(destinationRegion);
        return this;
    }

    /**
     * <p>
     * The number of days to retain automated snapshots in the destination
     * region after they are copied from the source region.
     * </p>
     * <p>
     * Default: 7.
     * </p>
     * <p>
     * Constraints: Must be at least 1 and no more than 35.
     * </p>
     * 
     * @param retentionPeriod
     *        The number of days to retain automated snapshots in the
     *        destination region after they are copied from the source region.
     *        </p>
     *        <p>
     *        Default: 7.
     *        </p>
     *        <p>
     *        Constraints: Must be at least 1 and no more than 35.
     */

    public void setRetentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain automated snapshots in the destination
     * region after they are copied from the source region.
     * </p>
     * <p>
     * Default: 7.
     * </p>
     * <p>
     * Constraints: Must be at least 1 and no more than 35.
     * </p>
     * 
     * @return The number of days to retain automated snapshots in the
     *         destination region after they are copied from the source region.
     *         </p>
     *         <p>
     *         Default: 7.
     *         </p>
     *         <p>
     *         Constraints: Must be at least 1 and no more than 35.
     */

    public Integer getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * The number of days to retain automated snapshots in the destination
     * region after they are copied from the source region.
     * </p>
     * <p>
     * Default: 7.
     * </p>
     * <p>
     * Constraints: Must be at least 1 and no more than 35.
     * </p>
     * 
     * @param retentionPeriod
     *        The number of days to retain automated snapshots in the
     *        destination region after they are copied from the source region.
     *        </p>
     *        <p>
     *        Default: 7.
     *        </p>
     *        <p>
     *        Constraints: Must be at least 1 and no more than 35.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EnableSnapshotCopyRequest withRetentionPeriod(Integer retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * The name of the snapshot copy grant to use when snapshots of an AWS
     * KMS-encrypted cluster are copied to the destination region.
     * </p>
     * 
     * @param snapshotCopyGrantName
     *        The name of the snapshot copy grant to use when snapshots of an
     *        AWS KMS-encrypted cluster are copied to the destination region.
     */

    public void setSnapshotCopyGrantName(String snapshotCopyGrantName) {
        this.snapshotCopyGrantName = snapshotCopyGrantName;
    }

    /**
     * <p>
     * The name of the snapshot copy grant to use when snapshots of an AWS
     * KMS-encrypted cluster are copied to the destination region.
     * </p>
     * 
     * @return The name of the snapshot copy grant to use when snapshots of an
     *         AWS KMS-encrypted cluster are copied to the destination region.
     */

    public String getSnapshotCopyGrantName() {
        return this.snapshotCopyGrantName;
    }

    /**
     * <p>
     * The name of the snapshot copy grant to use when snapshots of an AWS
     * KMS-encrypted cluster are copied to the destination region.
     * </p>
     * 
     * @param snapshotCopyGrantName
     *        The name of the snapshot copy grant to use when snapshots of an
     *        AWS KMS-encrypted cluster are copied to the destination region.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EnableSnapshotCopyRequest withSnapshotCopyGrantName(
            String snapshotCopyGrantName) {
        setSnapshotCopyGrantName(snapshotCopyGrantName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getDestinationRegion() != null)
            sb.append("DestinationRegion: " + getDestinationRegion() + ",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: " + getRetentionPeriod() + ",");
        if (getSnapshotCopyGrantName() != null)
            sb.append("SnapshotCopyGrantName: " + getSnapshotCopyGrantName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableSnapshotCopyRequest == false)
            return false;
        EnableSnapshotCopyRequest other = (EnableSnapshotCopyRequest) obj;
        if (other.getClusterIdentifier() == null
                ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(
                        this.getClusterIdentifier()) == false)
            return false;
        if (other.getDestinationRegion() == null
                ^ this.getDestinationRegion() == null)
            return false;
        if (other.getDestinationRegion() != null
                && other.getDestinationRegion().equals(
                        this.getDestinationRegion()) == false)
            return false;
        if (other.getRetentionPeriod() == null
                ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null
                && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getSnapshotCopyGrantName() == null
                ^ this.getSnapshotCopyGrantName() == null)
            return false;
        if (other.getSnapshotCopyGrantName() != null
                && other.getSnapshotCopyGrantName().equals(
                        this.getSnapshotCopyGrantName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getClusterIdentifier() == null) ? 0
                        : getClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getDestinationRegion() == null) ? 0
                        : getDestinationRegion().hashCode());
        hashCode = prime
                * hashCode
                + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotCopyGrantName() == null) ? 0
                        : getSnapshotCopyGrantName().hashCode());
        return hashCode;
    }

    @Override
    public EnableSnapshotCopyRequest clone() {
        return (EnableSnapshotCopyRequest) super.clone();
    }
}
