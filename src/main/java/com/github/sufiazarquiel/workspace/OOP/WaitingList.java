package com.github.sufiazarquiel.workspace.oop;

import java.util.ArrayList;

public class WaitingList {
    // Attributes
    private ArrayList<Paciente> waitingList;

    // Constructors
    public WaitingList() {
        this.waitingList = new ArrayList<Paciente>();
    }

    // Methods
    public void setWaitingList(ArrayList<Paciente> waitingList) {
        this.waitingList = waitingList;
    }
    
    public void add(Paciente paciente) {
        this.waitingList.add(paciente);
    }

    public void remove(Paciente paciente) {
        this.waitingList.remove(paciente);
    }

    public void remove(int index) {
        this.waitingList.remove(index);
    }

    public Paciente attend() {
        return this.waitingList.remove(0);
    }

    @Override
    public String toString() {
        return "WaitingList [waitingList\n=" + waitingList + "]";
    }

    /**
     * Jumps a patient to a specific index in the waiting list
     * @param Paciente Patient to be moved
     * @param index Index the patient will be moved to
     * @return void
     * 
     * @author Sufi
     */
    public void jumpQueue(Paciente paciente, int index) {
        if (index < 0 || index > this.waitingList.size()) {
            System.out.println("Invalid index, will add to the end of the list");
            this.waitingList.add(paciente);
            return;
        } else {
            this.waitingList.remove(paciente);
            this.waitingList.add(index, paciente);
        }
    }
}
