package com.orion.mm.persistence;

import com.orion.mm.domain.Listing;

public interface ListingMapper {
		
	public void addListing(Listing listing);
	
	public Listing getListing(Listing listing);
	
}
