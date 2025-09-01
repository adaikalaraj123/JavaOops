package com.voterapp.service;

import com.voterapp.exception.*;

public class ElectionBoothServiceImpl implements IElectionBoothService {

    @Override
    public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
        if (checkAge(age) && checkLocality(locality) && checkVoterId(vid)) {
            return true;
        }
        return false;
    }

    private boolean checkAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("You must be 18 or above to vote.");
        }
        return true;
    }

    private boolean checkLocality(String locality) throws LocalityNotFoundException {
        String[] localities = {"JP Nagar", "ABC Nagar", "Whitefield"};
        for (String loc : localities) {
            if (loc.equalsIgnoreCase(locality)) {
                return true;
            }
        }
        throw new LocalityNotFoundException("Locality " + locality + " not found in voter list.");
    }

    private boolean checkVoterId(int voterId) throws InvalidVoterIDException {
        if (voterId < 1000 || voterId > 9999) {
            throw new InvalidVoterIDException("Invalid Voter ID. Must be between 1000 and 9999.");
        }
        return true;
    }
}
