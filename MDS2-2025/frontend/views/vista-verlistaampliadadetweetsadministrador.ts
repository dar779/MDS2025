import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-verlistaampliadadetweetsadministrador')
export class VistaVerlistaampliadadetweetsadministrador extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout id="vaadinVerticalLayout3" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout id="vaadinVerticalLayout2" style="width: 20%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout id="vaadinVerticalLayout1" style="width: 60%;">
   <vaadin-vertical-layout theme="spacing" id="tweets" style="width: 100%; height: 85%; margin-bottom: var(--lumo-space-m);"></vaadin-vertical-layout>
   <vaadin-button id="volver" style="align-self: center; width: 20%;" tabindex="0">
     Volver 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="vaadinVerticalLayout" style="width: 20%;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
