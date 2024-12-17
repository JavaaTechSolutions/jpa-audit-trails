package com.jts.jpa_audit_trails;

import java.time.LocalDateTime;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

public class AuditListener {

	@PrePersist
	public void setCreatedOn(Auditable auditable) {
		auditable.setCreatedAt(LocalDateTime.now());
		auditable.setUpdatedAt(LocalDateTime.now());
	}

	@PreUpdate
	public void setUpdatedOn(Auditable auditable) {
		auditable.setUpdatedAt(LocalDateTime.now());
	}
}
