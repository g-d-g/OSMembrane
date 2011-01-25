package de.osmembrane.model.pipeline;

import java.io.Serializable;

/**
 * Represents a {@link AbstractConnector} of a {@link AbstractFunction}.
 * 
 * @author jakob_jarosch
 */
public abstract class AbstractConnector implements Serializable {

	private static final long serialVersionUID = 2011010722200001L;

	/**
	 * Type of the connector.
	 */
	public enum ConnectorPosition {
		/** Connector is an in connector */
		IN,

		/** Connector is an out connector */
		OUT
	}

	/**
	 * Returns the parent, a {@link AbstractFunction}, of the
	 * {@link AbstractConnector}.
	 * 
	 * @return
	 */
	public abstract AbstractFunction getParent();

	/**
	 * Returns the localized description of the {@link AbstractConnector}.
	 * 
	 * @return localized description
	 */
	public abstract String getDescription();

	/**
	 * Returns the {@link ConnectorType} of the {@link AbstractConnector}.
	 * 
	 * @return type of the connector
	 */
	public abstract ConnectorType getType();

	/**
	 * Returns the maximum connections of this connector.
	 * 
	 * @return the maximum connection count
	 */
	public abstract int getMaxConnections();

	/**
	 * Returns the "fullness" of the connector.
	 * 
	 * @return true if the connector is full, otherwise false
	 */
	public abstract boolean isFull();

	/**
	 * Returns the Connections to other connectors.
	 * 
	 * @return an array of other {@link AbstractConnector}s to which this
	 *         connector is connected.
	 */
	public abstract AbstractConnector[] getConnections();

	/**
	 * Creates a connection to another connector.
	 * 
	 * @param connector
	 *            to which a connection should be created
	 * 
	 * @return true if a connection could be created, otherwise false
	 */
	protected abstract boolean addConnection(AbstractConnector connector);

	/**
	 * Removes a connection to another connector.
	 * 
	 * @param connector
	 *            from which the connection should be removed
	 * 
	 * @return true if there was a connection
	 */
	protected abstract boolean removeConnection(AbstractConnector connector);

	/**
	 * Removes all connections (in both directions).
	 * 
	 * @param isOutConnector
	 *            true if the connector is an out connector
	 */
	protected abstract void unlink(boolean isOutConnector);
}