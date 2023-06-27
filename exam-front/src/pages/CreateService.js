import { useState } from "react";

export function CreateService(){
    const [name, setName] = useState("");
    const [address, setAddress] = useState("");
    const [manager, setManager] = useState("");

    const createService = () => {
        fetch('/api/admin/service', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(
                {
                    name,
                    address,
                    manager
                }
            )
        });
        
    };

    return (<div>
        <fieldset id="create">
            <legend>New Auto Service</legend>
            <div>
                <label htmlFor="name">Name</label>
                <input 
                id="name" 
                value={name} 
                onChange={(e) => setName(e.target.value)}/>
            </div>
            <div>
                <label htmlFor="address">Address</label>
                <input 
                id="address" 
                value={address} 
                onChange={(e) => setAddress(e.target.value)}/>
            </div>
            <div>
                <label htmlFor="manager">Manager</label>
                <input 
                id="manager" 
                value={manager} 
                onChange={(e) => setManager(e.target.value)}/>
            </div>
            <div>
                <button onClick={createService}>Create</button>
            </div>
        </fieldset>
        </div>);
}