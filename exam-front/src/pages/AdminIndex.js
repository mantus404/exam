import { Link } from "react-router-dom";

export function AdminIndex(){
    return (<div style={{ textAlign: 'center'}}>
        <ul style={{listStyle: 'none'}}>
        <li><Link to='/viewservice'>Edit Auto Services</Link></li>
        <li><Link to='/viewtechnician'>Edit Technicians</Link></li>
        </ul>
    </div>);
}